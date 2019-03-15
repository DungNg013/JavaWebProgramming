/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi.n;

import java.util.Scanner;

/**
 *
 * @author Dell E5440
 */
public class MyDate {
    
    private int ngay;
    private int thang;
    private int nam;
    int k;
    
    public MyDate() {
    }

    public MyDate(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public int getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    
    void inPutInfo(){
        Scanner sc = new Scanner(System.in);
        
         System.out.println("nhap ngay: ");
        ngay = sc.nextInt();
         System.out.println("nhap thang: ");
        thang = sc.nextInt();
         System.out.println("nhap nam: ");
        nam = sc.nextInt();
         System.out.println(" tuy chon: ");
         System.out.println(" 1. dang ngan");
         System.out.println(" 2. dang dai");
        
        k = sc.nextInt();
    }
    
    
    void printInfo(){
        
        if(thang == 2){ 
            if(nam % 400 ==0 || nam%4==0 && nam%100!=0 || nam %100 ==0){
                if( ngay> 29)
                     System.out.println("ngay ko hop le");
                
            }
            else
                if( ngay >28 )
                    System.out.println("ngay ko hop le");
            
        }
        if(thang==1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 ||thang == 10 ||thang == 12 ){
            if(ngay > 31)
                System.out.println("ngay ko hop le");
        
    }
        if(thang==4 || thang == 6 || thang == 9 || thang == 11){
            if(ngay > 30)
                System.out.println("ngay ko hop le");
        }
        if(thang > 12 || thang < 1)
             System.out.println(" thang ko hop le" );
        else  
            if( k!=1 || k!=2)
                System.out.println("ko hop le");
            switch(k){
                case 1:
                    System.out.println(this.ngay + "/" + this.thang + "/" + this.nam );
                    break;
                case 2: 
                    System.out.println(" ngay " +this.ngay + "thang" + this.thang + "nam" + this.nam );
                    break;
            }
            
        
              
            
    }
}
