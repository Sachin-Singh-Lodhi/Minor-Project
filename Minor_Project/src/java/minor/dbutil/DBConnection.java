/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minor.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static Connection conn;
    static{try{  Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-44QMENB:1521/xe","minor_project_db","minorproject");
           
           }
           catch(Exception ex){
               System.out.println("ERROR in DB :"+ex);
           }
  }
    
    public static Connection getConnection(){
    return conn;
    }
    public static void closeConnection(){
    try{
     conn.close();
    }
    catch(Exception ex){ System.out.println(" Problem While Closing Connection");}
   }
}
