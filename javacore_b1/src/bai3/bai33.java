/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;
/**
 *
 * @author Dell E5440
 */
public class bai33 {
    public static void main(String[] args) {
        float a,b;
         Scanner sc = new Scanner(System.in);
            a = sc.nextFloat();
             b = sc.nextFloat(); 
      boolean kiemTra = ( a > b);
        System.out.println(a + " > "+ b + " ? : " + kiemTra);
        kiemTra = ( a == b);
        System.out.println(a + " = "+ b + "  ? : " + kiemTra);
        kiemTra = ( a < b);
        System.out.println(a + " < "+ b + " g ? : " + kiemTra);
        
    }
}
    
    

