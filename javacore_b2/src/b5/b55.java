/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b5;

import java.util.Scanner;


/**
 *
 * @author Dell E5440
 */
public class b55 {
    public static void main(String[] args) {
         
    float a,b,c,d,e,f;     
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println(" nhap vao gia tri Xa, Ya, Za");
    
    a = sc.nextFloat();
    b = sc.nextFloat();
    c = sc.nextFloat();
    
    System.out.println(" nhap vao gia tri Xb, Yb, Zb");
    
    d = sc.nextFloat();
    e = sc.nextFloat();
    f = sc.nextFloat();
    
     System.out.println(" tong cua hai vector la: ");
      System.out.print(" C(" );
      System.out.print(" " +(a+d));
      System.out.print(", " +(b+e));
      System.out.print(", " +(c+f));
      System.out.println(")") ;
    
      System.out.print(" tich vo huong cua hai vec to la: " );
      System.out.print("" +(a*d+b*e+c*f));
     }
}
