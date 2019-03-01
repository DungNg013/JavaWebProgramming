/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b4;

import java.util.Random;

/**
 *
 * @author Dell E5440
 */
public class b44 {
     public static void main(String[] args) {
    
    int arr[] = new int[15];
    int even = 0, old = 0;
    for( int i = 0; i < arr.length; i++){
        Random rd = new Random(); 
        
        arr[i] = rd.nextInt(15);
        
        if( arr[i] != 0){
            if( arr[i] % 2 == 0)
            even++;
            else 
            old++;
        }
        
        
        System.out.println("  " +arr[i] );
    
}
       int b = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    b = arr[j];
                    arr[j] = arr[i];
                    arr[i] = b;
                }
            }
        }
         System.out.println(" sap xep tang dan: ");
        for( int i = 0; i < arr.length; i++){
            System.out.println("  " +arr[i] );
        }
        
          for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    b = arr[j];
                    arr[j] = arr[i];
                    arr[i] = b;
                }
            }
        }
            System.out.println(" sap xep giam dan: ");
        for( int i = 0; i < arr.length; i++){
            System.out.println("  " +arr[i] );
        }
        
        System.out.println("so so chan la:   "  + even);
        System.out.println("so so le la:  " + old);
        
        
    
}
}
