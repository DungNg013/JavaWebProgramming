/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dell E5440
 */
public class StudentManager {
    Connection conn;
    public StudentManager() throws ClassNotFoundException, SQLException{
        Connector db = new Connector();
        this.conn = db.getConnect();
    }
    public boolean login(String email, String pass) throws SQLException{
        String query = "selec * from students where email = ? and pass = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setString(1, email);
        ps.setString(2, pass);
        
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }
    public void quention(){
    
    }
    
}
