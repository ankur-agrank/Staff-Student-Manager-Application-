
package jss.university;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jss_University","root","Thehiers1");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

