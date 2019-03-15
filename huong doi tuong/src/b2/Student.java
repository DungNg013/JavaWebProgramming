/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2;

import java.util.Scanner;

/**
 *
 * @author Dell E5440
 */
public class Student {
   private int maSV;
     private double dTB;
     private int age;
     private String lop;
    
    public Student(){
        
    }

    public Student(int maSV, double dTB, int age, String lop) {
        this.maSV = maSV;
        this.dTB = dTB;
        this.age = age;
        this.lop = lop;
    }

    public int getMaSV() {
        return maSV;
    }

    public double getdTB() {
        return dTB;
    }

    public int getAge() {
        return age;
    }

    public String getLop() {
        return lop;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public void setdTB(double dTB) {
        this.dTB = dTB;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
    
    void inputInfo(){
        
        Scanner sc = new Scanner(System.in);
        maSV = sc.nextInt();
        dTB = sc.nextDouble();
        age = sc.nextInt();
        lop = sc.nextLine();  
        
    }
    
    void printInfo(){
//     
         System.out.println("ma sinh vien: "+maSV);       
          System.out.println("diem trung bing: "+dTB);
           System.out.println("tuoi: "+age);
            System.out.println("lop: "+lop);
             
            
    }
    
    boolean bong ( double a){
        if(a >= 8.0){
                 return true;
             }
        else return false;
        
    }
    
    public boolean tinhBong(){
        boolean bong = this.bong(dTB);
        dTB = (double) (this.getdTB());
        if( bong == true){
            System.out.println("dat bong ");
        }
        return bong( dTB);
        
        
    }
}


    
    
 




    


