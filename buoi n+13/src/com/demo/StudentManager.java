/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell E5440
 */
public class StudentManager {
    
    private final String dir = "St.dat";
    private final ArrayList<Student> list;

    public StudentManager() {
        this.list = new ArrayList<>();
    }
    
    public void add(){
        Scanner input = new Scanner(System.in);
        Student Std = new Student();
        System.out.println("Rollnumber > ");
        Std.setRoollnumber(input.nextLine());
        System.out.print("Name > ");
        Std.setName(input.nextLine());
        System.out.print("Email > ");
        Std.setEmail(input.nextLine());
//        System.out.print("Age > ");
//        cus.setAge(Integer.parseInt(input.nextLine()));  
        this.list.add(Std);
        
    }
    public Student search(String name){
        boolean check = false;
        for (Student list1 : list) {
            if(list1.getName().equals(name)){
                System.out.println("tim thay: "+ name);
                check = true;
            }           
        }if(check == false){
            System.out.println("ko co");
        }       
        return null;
        
    }
    public Student update(String name){
        Scanner input = new Scanner(System.in);
        Student Std = new Student();
        boolean check = false;
        for (Student list1 : list) {
            if(list1.getName().equals(name)){
                System.out.println("Rollnumber > ");
                Std.setRoollnumber(input.nextLine());
                System.out.print("Email > ");
                Std.setEmail(input.nextLine());
                check = true;
            }           
        }if(check == false){
            System.out.println("ko co");
        }       
        return null;
    }
    public Student remove(String name){
//        Scanner input = new Scanner(System.in);
        Student Std = new Student();
        boolean check = false;
        for (Student list1 : list) {
            if(list1.getName().equals(name)){
                
             check = true;
            }           
        }if(check == false){
            System.out.println("ko co");
        }       
        return null;
    }
    public boolean save(){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dir));
            oos.writeObject(this.list);
            oos.flush();
            oos.close();
        } catch (Exception e) {
             e.printStackTrace();
            return false; 
        }
        return true;
        
    }
}
