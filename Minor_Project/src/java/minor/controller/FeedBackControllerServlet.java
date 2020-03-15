/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minor.controller;

import minor.dao.FeedbackDAO;
import minor.dto.FeedbackDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
public class FeedBackControllerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher rd = null;
        String e1 = request.getParameter("e1");
        String e2 = request.getParameter("e2");
        String e3 = request.getParameter("e3");
        String f1 = request.getParameter("f1");
        String f2 = request.getParameter("f2");
        String f3 = request.getParameter("f3");
        String t1 = request.getParameter("t1");
        String t2 = request.getParameter("t2");
        String t3 = request.getParameter("t3");
        String s1 = request.getParameter("s1");
        String s2 = request.getParameter("s2");
        String s3 = request.getParameter("s3");
        String ac_year = request.getParameter("year");
        String semester = request.getParameter("sem");
        String feedback_date = request.getParameter("date");
        String course = request.getParameter("course");
        String faculty_name = request.getParameter("fname");
        int excellent = Integer.parseInt(request.getParameter("excellent"));
        int good = Integer.parseInt(request.getParameter("good"));
        int fair = Integer.parseInt(request.getParameter("fair"));
        int poor = Integer.parseInt(request.getParameter("poor"));
        int very_poor = Integer.parseInt(request.getParameter("very_poor"));
        int very_good = Integer.parseInt(request.getParameter("very_good"));
        
        
        
            System.out.println("Inside processresponse");
        
        FeedbackDTO feedback = new FeedbackDTO(e1, e2, e3, f1, f2, f3, t1, t2, t3, s1, s2, s3, ac_year, semester, feedback_date, course, faculty_name, excellent, very_good, good, fair, poor, very_poor);
        try{
            boolean result = FeedbackDAO.addFeedback(feedback);
            System.out.println("dispatched to feedbackresponse");
            rd=request.getRequestDispatcher("feedbackresponse.jsp");
            request.setAttribute("result", result);

        }
        catch(Exception ex){
            System.out.println("EXCEPTION in DB "+ex);
             rd=request.getRequestDispatcher("showexception.jsp");
             ex.printStackTrace();
        }
        finally{
        rd.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
