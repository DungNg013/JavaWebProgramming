/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db2;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell E5440
 */
public class DB2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Scanner input = new Scanner(System.in);
            System.out.println("  quiz  ");
            System.out.println("-------");
            System.out.println("enter email");
            String email = input.nextLine();
            System.out.println("enter pass");
            String pass = input.nextLine();
            
            StudentManager sm = new StudentManager();
            boolean check = sm.login(email, pass);
            
            if(check){
                System.out.println("login succes");
                input.nextLine();
                QuestionManager qm = new QuestionManager();
                List<Question> questions = qm.getQuestion();
                int count = 0;
                int index = 1;
                for(Question q : questions){
                    System.out.printf("Question %d/%d \n", index++, questions.size());
                    System.out.println(q);
                    System.out.println("your answer ");
                    String answer = input.nextLine();
                    if(answer.toLowerCase().equals(q.getContent().toLowerCase())){
                        count++;
                    }
                    System.out.println("congratulation");
                    System.out.printf("your result: %d/%d", count, questions.size());
                        
                            
                }
            }
            else{
                System.out.println("login fail");
            }
        
        } catch (Exception ex) {
           ex.printStackTrace();
        }
           
           
    }
    
}
