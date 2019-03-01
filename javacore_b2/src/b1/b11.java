/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1;

import java.util.Scanner;
/**
 *
 * @author Dell E5440
 */
public class b11 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int[] phantu = new int [5];
     Scanner sc = new Scanner(System.in);
     
     for(int i=0; i<phantu.length; i++){
         phantu[i] = sc.nextInt();
     }
     int tong = 0;
     for(int j=0; j<phantu.length;j++ ){
         tong += phantu[j];
         System.out.println("phantu:" + phantu[j]  );
     }
     System.out.println("tong:" + tong  );
     int tongChan = 0; 
     int tongLe = 0;
     for(int f=0; f<phantu.length; f++){
         if(phantu[f] %2 ==0){
           tongChan += phantu[f];
           
         }
         else
         {
             tongLe += phantu[f];
         }
     }
     System.out.println("tongchan:" + tongChan  );
     System.out.println("tongle:" + tongLe );
    }
    
  

    
}
