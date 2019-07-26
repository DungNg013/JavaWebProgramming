/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;





/**
 *
 * @author Dell E5440
 */
public class Connector {
//    Class.forname("com.mysql.jdbc.Driver");
    public Connection getConnect() throws ClassNotFoundException, SQLException{
        
            // TODO code application logic here
            Class.forName("com.mysql.jdbc.Driver");
            String connStr = "jdbc:mysql://localhost:3306/qli";
            Connection conn = DriverManager.getConnection(connStr,"root","123123");
            return conn;
    }
}
