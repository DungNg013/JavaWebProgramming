
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
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
public class UserMode {
    public void insert(User user) throws SQLException, ClassNotFoundException{
        Connector db = new Connector();
        Connection conn = db.getConnect();
        String sql = "  insert into users(username, password, fullname, email, address)" 
                    + "values(?,?,?,?,?)";
        PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);
        pstmt.setString(1, user.getUsername());
        pstmt.setString(2, user.getPassword());
        pstmt.setString(3, user.getFullname());
        pstmt.setString(4, user.getEmail());
        pstmt.setString(5, user.getAddress());
          
        pstmt.executeUpdate();
    }
    
}
