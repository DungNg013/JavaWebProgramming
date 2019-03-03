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
    String name;
    int age;
    String diaChi;
    double luong;
    int tongGioLm;
 
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
         
         String name = new String();
         age = sc.nextInt();
         String diaChi = new String();
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
    
    double tinhThuong(){
        double thuong=0;
        if(tongGioLm >=200)
            thuong = luong*20/100;
        else if(tongGioLm>=100 && tongGioLm<200)
            thuong = luong*10/100;
        else
            thuong = 0;
    }
    
}
//

//}
