
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell E5440
 */
public class Connector {
    public Connection getConnect() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        String connStr = "jdb:mysql://localhost:3306/user";
        String user ="root";
        String pass ="123123";
      
        return DriverManager.getConnection(connStr, user, pass);
        
    }
}
