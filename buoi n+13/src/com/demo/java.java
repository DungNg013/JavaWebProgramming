/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo;

import java.util.Scanner;



/**
 *
 * @author Dell E5440
 */
public class java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        StudentManager mana = new StudentManager();
        while(true){
            System.out.println("1. add");
            System.out.println("2. search");
            System.out.println("3. update");
            System.out.println("5. save");
            System.out.println("7. exit");        
            
            int choi;
            choi = input.nextInt();
            switch(choi){
                case 1:
                    mana.add();
                    break;
                case 2:
                    System.out.println("name > ");
                    String name = input.nextLine();
                    Student Std = mana.search(name);
                    break;
                case 3:
                    System.out.println("name > ");
                    name = input.nextLine();
                    Std = mana.update(name);
                    break;
                case 5:
                     if (mana.save()) {
                        System.out.println("Successful");
                    } else {
                        System.out.println("Error");
                    }
                    break;
                case 7:
                      System.exit(0);
                default:
                    System.out.println("Not valid");
                
            }
        }
        
    }
    
}
