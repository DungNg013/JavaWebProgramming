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

public class NhanVien {
    private String name;
    private int age;
    private String diaChi;
    private double luong;
    private int tongGioLm;
 
    public NhanVien() {
    }

    public NhanVien(String name, int age, String diaChi, double luong, int tongGioLm) {
        this.name = name;
        this.age = age;
        this.diaChi = diaChi;
        this.luong = luong;
        this.tongGioLm = tongGioLm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getTongGioLm() {
        return tongGioLm;
    }

    public void setTongGioLm(int tongGioLm) {
        this.tongGioLm = tongGioLm;
    }
    
    
    void inputInfo(){
        
         Scanner sc = new Scanner(System.in);
         
         name = sc.nextLine();
         age = sc.nextInt();
         diaChi = sc.nextLine();
         luong = sc.nextDouble();
         tongGioLm = sc.nextInt();
    }
    
    void printInfo(){
        
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Luong: " + luong);
        System.out.println("Tong gio lm: " + tongGioLm);
        
        
    }
    
//     public void print(){
//           System.out.println(this.tinhThuong(tongGioLm) );
//       }
//    
      
    
    public double thuong(){
        double tinhThuong = this.tinhThuong(tongGioLm);
        tongGioLm = (int) (this.getTongGioLm()/ tinhThuong);
        return tinhThuong(tongGioLm);
        
    }
    
   
     float tinhThuong(int a){
       float thuong = 0;
        if(a >=200)
            thuong = (float) (luong*20.0/100);
        else if(a >=100 && a <200)
            thuong = (float) (luong*10.0/100);
        else 
            thuong = 0;
        System.out.println(" thuong la: "+ thuong);
        return thuong;
        
    }
}
//

