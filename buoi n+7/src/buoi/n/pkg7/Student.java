/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi.n.pkg7;

/**
 *
 * @author Dell E5440
 */
public class Student extends Person {
    
    private String studentID;

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    public void print(){
        
    }
    @Override
    public String toString(){
        return this.name + " " + this.age;
    }
    
}
