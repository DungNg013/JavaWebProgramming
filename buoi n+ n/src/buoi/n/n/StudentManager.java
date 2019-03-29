/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi.n.n;

import java.util.Scanner;

/**
 *
 * @author Dell E5440
 */
public class StudentManager  {
    private static final int MAX_STUDENT = 20;
    student[] listStudent;
    private int currentQuan ;

    public StudentManager() {
        this.listStudent =new student[MAX_STUDENT];
        this.currentQuan = 0;
    }
    
    public boolean add(student s){
        if(currentQuan < StudentManager.MAX_STUDENT){
           this.listStudent[this.currentQuan] = s;
            this.currentQuan++;
            return true;
        }
        else
            return false;
        
        
     //return false;   
    }
    
    public void search (){
        
        
    }
    
    public void list(){
        
       
        
    }
    
    public void list(boolean order){
        
    }
    
    
    
}
