/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b6;

import java.util.Scanner;

/**
 *
 * @author Dell E5440
 */
public class chuNhat {
    
    private int a;
    private int b;

    public chuNhat() {
    }

    public chuNhat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    void inputInfo(){
       Scanner sc = new Scanner(System.in);
       System.out.println("nhap vao lan luot chieu dai va rong");
       a = sc.nextInt();
       b = sc.nextInt();
               
    }
    
    void chuVi(){
        float chV = 0;
        chV = (a+b)*2;
         System.out.println("chu vi la: "+chV);
    }
    
    void dienTich(){
        float diT = 0;
        diT = a*b;
         System.out.println("dien tich la: "+diT);
    }
    
    
}
