package bai2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Dell E5440
 */
public class bt2_2 {
        public static void main(String[] args) {
        
     int[] phantu = new int [5];
     Scanner sc = new Scanner(System.in);
     
          for(int i=0; i<phantu.length; i++){
         phantu[i] = sc.nextInt();
          }
     int max=phantu[1];
     int min=phantu[1];
     for( int i=0;i<phantu.length;i++){
         if(phantu[i]>max)
             max = phantu[i];
         if(phantu[i]<min)
             min = phantu[i];
         if(phantu[i] % 3 ==0)
                  System.out.println(" sochiahetcho3 = " +phantu[i]);
        
             
     }
     System.out.println(" max = " +max);
     System.out.println(" min = " +min);
     

     

    
}
}
