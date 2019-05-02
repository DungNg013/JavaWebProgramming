package java.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell E5440
 */
public class CustomerManager {
    private String dir = "cus.dat";
    private ArrayList<Customer> list;
    
    public CustomerManager() {
        this.list = new ArrayList<>();
    }
    
    public boolean load(String file){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            List<Customer> data = (List<Customer>) ois.readObject();
            this.list = (ArrayList<Customer>) data;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
        return true;
    }
    public void add(){
        
        Scanner input = new Scanner(System.in);
        Customer cus = new Customer();
        System.out.println("ID");
        cus.setId(Integer.parseInt(input.nextLine()));
        System.out.print("Name > ");
        cus.setName(input.nextLine());
        System.out.print("Address > ");
        cus.setAddress(input.nextLine());
        System.out.print("Age > ");
        cus.setAge(Integer.parseInt(input.nextLine()));  
        this.list.add(cus);
    }
    public Customer search(int id){
        for (Customer customer : list) {
            if(customer.getId() == id) 
                return customer;
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
