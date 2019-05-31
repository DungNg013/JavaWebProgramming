/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell E5440
 */
public class QuestionManager {
    private Connection conn = null;
    public QuestionManager() throws SQLException, ClassNotFoundException{
        this.conn = new Connector().getConnect();
    }
    public List<Question> getQuestion() throws SQLException{
        String Query = "select * from questions";
        Statement st = this.conn.createStatement();
        ResultSet rs = st.executeQuery(Query);
        List<Question>list = new ArrayList<>();
        while(rs.next()){
            Question q = new Question();
            q.getContent(rs.getString("content"));
            q.getAnswerA(rs.getString("answer_A"));
            q.getAnswerA(rs.getString("answer_B"));
            q.getAnswerA(rs.getString("answer_C"));
            q.getAnswerA(rs.getString("answer_D"));
            q.getCorrect(rs.getString("correct"));
            list.add(q);
    }
        return list;
    }
    
    
}
