/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3;

import java.util.Scanner;


/**
 *
 * @author Dell E5440
 */
public class b33 {
          public static void main(String[] args) {
        
     int[] phantu = new int [5];
     Scanner sc = new Scanner(System.in);
      for(int i=0; i<phantu.length; i++){
         phantu[i] = sc.nextInt();
     }
     int a;
     a = sc.nextInt();
     for( int i=0;i<phantu.length;i++){
        if( phantu[i] == a)
            
            System.out.println(" a xuat hien tai vi tri: " +i);
             
     }
         
             
             
            
    
}
}
