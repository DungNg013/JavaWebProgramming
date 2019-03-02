/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_manghaichieu;

import java.util.Scanner;

/**
 *
 * @author Dell E5440
 */
public class b22_2chieu {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
         
        int arr[][] = new int [3][3];
        int brr[][] = new int [3][3];
        int crr[][] = new int [3][3];
         System.out.print(" nhap arr[3][3]:");
         for (int i = 0 ; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
         System.out.print(" nhap brr[3][3]:"); 
          for (int i = 0 ; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                brr[i][j] = sc.nextInt();
            }
        }
          
          for (int i = 0 ; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                crr[i][j] = arr[i][j] + brr[i][j];
                
            }
        }
          
           System.out.println("tong hai ma tran");
           for (int i = 0 ; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(+crr[i][j] + "\t");
               
            }
             System.out.println("\n");   
          }
          
           for(int i = 0; i<3 ; i++){
    
            for(int k = 0; k<3 ; k++)
                {
                    crr[i][k] = 0;
                    
                    for(int j = 0; j<3 ; j++){
                        crr[i][k] = crr[i][k] + arr[i][j]*brr[j][k];
                    }
                        
                }
            }
           
            System.out.println(" tich hai ma tran");
           for (int i = 0 ; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(+crr[i][j] + "\t");
               
            }
             System.out.println("\n");   
          }
          
          
    }        
    
}
