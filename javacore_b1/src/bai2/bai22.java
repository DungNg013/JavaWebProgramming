/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;
/**
 *
 * @author Dell E5440
 */
public class bai22 {
        public static void main(String[] args) {
            float a,b,c;
            Scanner sc = new Scanner(System.in);
            a = sc.nextFloat();
             b = sc.nextFloat();
              c = sc.nextFloat();
              float x=0;
            if(a==0){
                if(b==0){
                    if(c==0){
                        System.out.println("phuong trinh co vo so nghiem");
                    }
                    else{
                        System.out.println("phuong trinh vo nghiem");
                    }
                }
                else{
                    if(c==b){
                        System.out.println("phuong trinh vo so nghiem");
                    }
                    else
                     System.out.println("phuong trinh vo nghiem");
                }
            }
            else{
               // if(b==0){
                   // if(c==0){
                    //    System.out.println("x = 0");
                    //}
               
                       x = (c-b)/a;
                       System.out.println("x = " +x); 
                    }
               // }
                //else{
                    
              //  }
            }
      //  }

    
}
