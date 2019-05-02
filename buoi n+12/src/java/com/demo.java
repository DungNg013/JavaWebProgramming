/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.com;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Dell E5440
 */
public class demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        CustomerManager manager = new CustomerManager();
        
        while (true) {
        System.out.println("Menu");
        System.out.println(" 1. Load data");
        System.out.println(" 2. Add New");
        System.out.println(" 3. Search");
        System.out.println(" 4. Save");
        System.out.println(" 5. Exit");
        int choi;
        Scanner sc = new Scanner(System.in);
        choi = sc.nextInt();
        switch(choi){
            case 1:
                    System.out.print("File Path  ");
                    String path = input.nextLine();
                    if (manager.load(path)) {
                        System.out.println("Successful");
                    } else {
                        System.out.println("Error");
                    }
                    break;
                case 2:
                    manager.add();
                    break;
                case 3:
                    if (manager.save()) {
                        System.out.println("Successful");
                    } else {
                        System.out.println("Error");
                    }
                    break;
                case 4:
                    System.out.print("Id > ");
                    int id = Integer.parseInt(input.nextLine());
                    Customer cust = manager.search(id);
                    if (cust != null) {
                        System.out.println(cust);
                    } else {
                        System.out.println("NOT FOUND");
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Not valid");
        }
        
            
                
                
        }
    
    }
  
    
}
