/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dahinh;

import java.util.Scanner;

/**
 *
 * @author Dell E5440
 */
public class DaHinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              // TODO code application logic here
        System.out.print("Student ? Employee ? (S|E) ");
        String c = new Scanner(System.in).nextLine();
        Manager instance = null;
        if (c.toUpperCase().equals("S")) {
            instance = new StudentManager();
        } else if (c.toUpperCase().equals("E")) {
            instance = new EmployeeManager();
        } else {
            System.out.println("Not valid");
        }

        if (instance != null) {
            menu menu = new menu(instance);
            menu.display();
        }

    }
    }
    

