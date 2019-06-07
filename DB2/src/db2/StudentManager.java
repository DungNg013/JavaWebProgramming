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
import java.util.List;

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
    public Students login(String email, String pass) throws SQLException{
        String query = "selec * from students where email = ? and pass = ?";
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.setString(1, email);
        ps.setString(2, pass);
        
        ResultSet rs = ps.executeQuery();
         Students s = null;
        if (rs.next()) {
            s = new Students(rs.getInt("id"), rs.getString("name"),
                    rs.getString("email"), rs.getString("pass"));
        }

        return s;
    }

    boolean isCompleted(Students s) throws SQLException {
         String query = "SELECT * FROM student_questions WHERE student_id = ?";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setInt(1, s.getId());
        ResultSet rs = pstmt.executeQuery();
        return rs.next(); //To change body of generated methods, choose Tools | Templates.
    }

    void resetQuiz(Students s) throws SQLException {
                String query = "DELETE FROM student_questions WHERE student_id = ?";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setInt(1, s.getId());
        pstmt.executeUpdate();
 //To change body of generated methods, choose Tools | Templates.
    }

    int addAnswer(Students s, Question q, String answer) throws SQLException {
         String query = "INSERT INTO student_questions VALUES (?,?,?)";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setInt(1, s.getId());
        pstmt.setInt(2, q.getId());
        pstmt.setString(3, answer);
        return pstmt.executeUpdate();//To change body of generated methods, choose Tools | Templates.
    }

    void printResult(Students s) throws SQLException, ClassNotFoundException {
           String query = "select sq.correct as student_answer, q.* from student_questions as sq "
                + "join questions as q on q.`id` = sq.`question_id` "
                + "where sq.`student_id` = ?";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setInt(1, s.getId());
        ResultSet rs = pstmt.executeQuery();
        int questionCount = 1;
        
        QuestionManager qm = new QuestionManager();
        List<Question> questions = qm.getQuestion();
          while (rs.next()) {
            // so sanh ket qua
            String result = rs.getString("correct").toLowerCase()
                    .equals(rs.getString("student_answer").toLowerCase()) 
                    ? "True" : "False";
            System.out.printf("Question %d/%d - %s\n", questionCount++, questions.size() ,result);
            System.out.println(rs.getString("content"));
            
            if (rs.getString("correct").equals("a"))
                System.out.println("[A]. " + rs.getString("answer_a"));
            else 
                System.out.println("A. " + rs.getString("answer_a"));
            
            if (rs.getString("correct").equals("b"))
                System.out.println("[B]. " + rs.getString("answer_b"));
            else 
                System.out.println("B. " + rs.getString("answer_b"));
            
            if (rs.getString("correct").equals("c"))
                System.out.println("[C]. " + rs.getString("answer_c"));
            else 
                System.out.println("C. " + rs.getString("answer_c"));
            
            if (rs.getString("correct").equals("d"))
                System.out.println("[D]. " + rs.getString("answer_d"));
            else 
                System.out.println("D. " + rs.getString("answer_d"));
            
            
        }
//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
