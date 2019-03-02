/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_2chieu;

import java.util.Scanner;

/**
 *
 * @author Dell E5440
 */
public class b11_2chieu {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
         
        int arr[][] = new int [3][3];
        
         for (int i = 0 ; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
//         
        //int[][] arr = {{1, 2}, {3, 4}, {5, 6}};
        
          for (int i = 0 ; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(+arr[i][j] + "\t");
               
            }
             System.out.println("\n");   
          }
          int h1 =0, h2 =0, h3 =0, c1 =0, c2 =0, c3 =0;
          for (int i = 0 ; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               if(i == 0)
                   h1 +=arr[i][j];
               if(i == 1)
                   h2 +=arr[i][j];
               if(i == 2)
                   h3 +=arr[i][j];
               if( j== 0)
                   c1 +=arr[i][j];
               if(j == 1)
                   c2 +=arr[i][j];
               if(j == 2)
                   c3 +=arr[i][j];    
                       
            }
          }
           System.out.println("hang 1: " +h1);
           System.out.println("hang 2: " +h2);
           System.out.println("hang 3: " +h3);
           System.out.println("cot 1: " +c1);
           System.out.println("cot 2: " +c2);
           System.out.println("cot 3: " +c3);
    }
}
