/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author Dell E5440
 */
public class DB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            // TODO code application logic here
            Class.forName("com.mysql.jdbc.Driver");
            String connStr = "jdbc:mysql://localhost:3306/qli";
            Connection conn = DriverManager.getConnection(connStr, "root", "123123");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
//        
        
    }

}
