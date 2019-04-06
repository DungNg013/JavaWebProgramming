/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeption;

import java.util.Scanner;

/**
 *
 * @author Dell E5440
 */
public class Exeption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        Input input = new Input();
       
        try{
            System.out.println("a/b =" );
            
        }catch(ArithmeticException e){
             System.out.println("can't div a number by zero");
            
        }catch(Exception e){
             System.out.println("error something!! ");
        }
        
    }
    
}
