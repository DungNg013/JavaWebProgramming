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
public class Input {
    public int inputNumber(){
        Scanner input = new Scanner(System.in);
        int a = 0;
        try{
            a = input.nextInt();
        }catch(Exception e){
            System.out.println("ko dung dinh dang");
            return this.inputNumber();
        }
        return a;
    }
    
}
