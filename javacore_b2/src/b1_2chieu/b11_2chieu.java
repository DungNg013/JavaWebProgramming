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
        
       //  for (int i = 0 ; i < 3; i++) {
        //    for (int j = 0; j < 3; j++) {
        //        arr[i][j] = sc.nextInt();
        //    }
       // }
         
       // int arr[][] = {{1, 2}, {3, 4}, {5, 6}};
        
          for (int i = 0 ; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(""+arr[i][j]);
            }
          }
    }
}
