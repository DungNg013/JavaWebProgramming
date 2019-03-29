/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m;

import java.util.Scanner;

/**
 *
 * @author Dell E5440
 */
public class main {
     public static void main(String[] args) {
         Product product [ ] = new Product[20];
         Store s = new Store( product );
         Scanner sc = new Scanner(System.in);
         int c = 0;
         do{
               System.out.println("1. AddProduct");
            System.out.println("2. ListProduct");
            System.out.println("3. SearchProduct");
            System.out.println("4. Exit");
            sc.nextLine();
            switch(c){
                case 1:
                    s.addProduct();
                    break;
                case 2:
                    s.listProducts();
                    break;
                case 3:
                    System.out.println("Nhap name");
                    s.search(sc.nextLine());
            }
            
            
         }while(c!=4);
     }
}
