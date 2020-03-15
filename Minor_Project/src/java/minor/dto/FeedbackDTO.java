package minor.dto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class FeedbackDTO {
    String e1 ;
    String e2;
    String e3 ;
    String f1 ;
    String f2;
    String f3;
    String t1;
    String t2 ;
    String t3 ;
    String s1;
    String s2;
    String s3;
    String ac_year ;
    String semester;
    String feedback_date;
    String course;
    String faculty_name;
    int excellent;
    int good ;
    int fair;
    int poor ;
    int very_poor ;
    int very_good;

    public FeedbackDTO() {
    }

    public FeedbackDTO(String e1, String e2, String e3, String f1, String f2, String f3, String t1, String t2, String t3, String s1, String s2, String s3, String ac_year, String semester, String feedback_date, String course, String faculty_name, int excellent, int very_good, int good, int fair, int poor, int very_poor) {
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.ac_year = ac_year;
        this.semester = semester;
        this.feedback_date = feedback_date;
        this.course = course;
        this.faculty_name = faculty_name;
        this.excellent = excellent;
        this.good = good;
        this.fair = fair;
        this.poor = poor;
        this.very_poor = very_poor;
    }

    public String getE1() {
        return e1;
    }

    public void setE1(String e1) {
        this.e1 = e1;
    }

    public String getE2() {
        return e2;
    }

    public void setE2(String e2) {
        this.e2 = e2;
    }

    public String getE3() {
        return e3;
    }

    public void setE3(String e3) {
        this.e3 = e3;
    }

    public String getF1() {
        return f1;
    }

    public void setF1(String f1) {
        this.f1 = f1;
    }

    public String getF2() {
        return f2;
    }

    public void setF2(String f2) {
        this.f2 = f2;
    }

    public String getF3() {
        return f3;
    }

    public void setF3(String f3) {
        this.f3 = f3;
    }

    public String getT1() {
        return t1;
    }

    public void setT1(String t1) {
        this.t1 = t1;
    }

    public String getT2() {
        return t2;
    }

    public void setT2(String t2) {
        this.t2 = t2;
    }

    public String getT3() {
        return t3;
    }

    public void setT3(String t3) {
        this.t3 = t3;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public String getS3() {
        return s3;
    }

    public void setS3(String s3) {
        this.s3 = s3;
    }

    public String getAc_year() {
        return ac_year;
    }

    public void setAc_year(String ac_year) {
        this.ac_year = ac_year;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getFeedback_date() {
        return feedback_date;
    }

    public void setFeedback_date(String feedback_date) {
        this.feedback_date = feedback_date;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFaculty_name() {
        return faculty_name;
    }

    public void setFaculty_name(String faculty_name) {
        this.faculty_name = faculty_name;
    }
    
    public int getExcellent() {
        return excellent;
    }

    public void setExcellent(int excellent) {
        this.excellent = excellent;
    }
    public int getGood() {
        return good;
    }

    public void setGood(int good) {
        this.good = good;
    }
    public int getFair() {
        return fair;
    }

    public void setFair(int fair) {
        this.fair = fair;
    }
    public int getPoor() {
        return poor;
    }

    public void setPoot(int poor) {
        this.poor = poor;
    }
    public int getVerypoor() {
        return very_poor;
    }

    public void setVerypoor(int very_poor) {
        this.very_poor = very_poor;
    }
    
    public int getVerygood() {
        return very_good;
    }

    public void setVerygood(int very_good) {
        this.very_good = very_good;
    }

    @Override
    public String toString() {
        return "FeedbackDTO{" + "e1=" + e1 + ", e2=" + e2 + ", e3=" + e3 + ", f1=" + f1 + ", f2=" + f2 + ", f3=" + f3 + ", t1=" + t1 + ", t2=" + t2 + ", t3=" + t3 + ", s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + ", ac_year=" + ac_year + ", semester=" + semester + ", feedback_date=" + feedback_date + ", course=" + course + ", faculty_name=" + faculty_name + ", excellent=" + excellent + ", good=" + good + ", fair=" + fair + ", poor=" + poor + ", very_poor=" + very_poor + ", very_good=" + very_good + '}';
    }

    
    
    
}
