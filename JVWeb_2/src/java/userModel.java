
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell E5440
 */
public class userModel {
      public List<User> getUsers() throws ClassNotFoundException, SQLException {
        Connector db = new Connector();
        Connection conn = db.getConnect();
        String sql = "SELECT * FROM sinhien";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<User> list = new ArrayList<>();
        while (rs.next()) {
            User s = new User();
            s.setHoten(rs.getString("hhoten"));
            s.setKhoa(rs.getString("khoa"));
            s.setLop(rs.getString("lop"));
           
            list.add(s);
        }
        return list;
    }
    
    public List<User> getUsersByMajor(String major) throws ClassNotFoundException, SQLException {
        Connector db = new Connector();
        Connection conn = db.getConnect();
        String sql = "SELECT * FROM sinhien WHERE major = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, major);
        ResultSet rs = pstmt.executeQuery();
        List<User> list = new ArrayList<>();
        while (rs.next()) {
            User s = new User();
            s.setHoten(rs.getString("hhoten"));
            s.setKhoa(rs.getString("khoa"));
            s.setLop(rs.getString("lop"));
            list.add(s);
        }
        return list;
    }
    }

