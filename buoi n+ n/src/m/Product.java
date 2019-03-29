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
public class Product {
   private  int id;
   private String name;
   private double price;
   private int quantity;
     public  Scanner sc = new Scanner(System.in);
    public Product() {
    }

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    void addNew(){
       
        
        System.out.println("Nhap vao id");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao name");
        name = sc.nextLine();
        System.out.println("Nhap vao price");
        price = sc.nextDouble();
        System.out.println("Nhap vao quantity");
        quantity = sc.nextInt();
        
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", sc=" + sc + '}';
    }

    
    
}
