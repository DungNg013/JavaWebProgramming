/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m;

//import java.util.Scanner;

import java.util.Scanner;


/**
 *
 * @author Dell E5440
 */
public class Store {
    Product[] products;
    //
     Scanner sc = new Scanner(System.in);
     int number = 0;

    public Store() {
    }

    public Store(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    
    public void addProduct(){
        Product p;
        System.out.println("them camera hay smartphone? (1/0)");
        int c = sc.nextInt();
        if(c==1){
            p = new Camera();
        }
        else{
            p = new SmartPhone();
        }
        
        p.addNew();
        if(number >= products.length){
            System.out.println(" ko them duoc");
            return;
        }
        products[number] = p;
        number++;
        
    }
    void listProducts(){
        System.out.println("Danh sach");
        for(Product p: products){
            if(p == null)
                break;
            System.out.println(p);
        }
    }
       void search(String name){
        for(Product p : products){
            if(p == null)
                break;
            if(p.getName().equals(name)){
                System.out.println(p);
                return ;
            }
        }
        System.out.println("Khong tim thay");
    }
        
                
    }

