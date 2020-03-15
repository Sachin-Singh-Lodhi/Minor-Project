/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minor.dao;

import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;
import minor.dbutil.DBConnection;
import minor.dto.FeedbackDTO;

/**
 *
 * @author ASUS
 */
public class FeedbackDAO {
    private static PreparedStatement ps;
    static{
        try{
       ps=DBConnection.getConnection().prepareStatement("insert into feedback values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        }catch(Exception ex){ System.out.println("ERROR in DB Comm "+ex); }

    }
    
    public static boolean addFeedback(FeedbackDTO feedback)throws SQLException{
        System.out.println(feedback);
        ps.setString(1, feedback.getE1());
        ps.setString(2, feedback.getE2());
        ps.setString(3, feedback.getE3());
        ps.setString(4, feedback.getF1());
        ps.setString(5, feedback.getF2());
        ps.setString(6, feedback.getF3());
        ps.setString(7, feedback.getT1());
        ps.setString(8, feedback.getT2());
        ps.setString(9, feedback.getT3());
        ps.setString(10, feedback.getS1());
        ps.setString(11, feedback.getS2());
        ps.setString(12, feedback.getS3());
        
        ps.setString(13, feedback.getAc_year());
        ps.setString(14, feedback.getSemester());
        ps.setString(15, feedback.getFeedback_date());
        ps.setString(16, feedback.getCourse());
        ps.setString(17, feedback.getFaculty_name());
        ps.setInt(18, feedback.getExcellent());
        ps.setInt(18, feedback.getVerygood());
        ps.setInt(19, feedback.getGood());
        ps.setInt(20, feedback.getFair());
        ps.setInt(21, feedback.getPoor());
        ps.setInt(22, feedback.getVerypoor());
        
        return (ps.executeUpdate()!=0);
    
    }
}

