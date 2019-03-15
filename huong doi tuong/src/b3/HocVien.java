/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3;

import java.util.Scanner;

/**
 *
 * @author Dell E5440
 */
public class HocVien {
     private String name; 
     private double dTK;
     private int noiQuy;
     private int lanThi;
     int a,b;

    public HocVien() {
    }

    public HocVien(String name, double dTK, int noiQuy, int lanThi) {
        this.name = name;
        this.dTK = dTK;
        this.noiQuy = noiQuy;
        this.lanThi = lanThi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getdTK() {
        return dTK;
    }

    public void setdTK(double dTK) {
        this.dTK = dTK;
    }

    public int getNoiQuy() {
        return noiQuy;
    }

    public void setNoiQuy(int noiQuy) {
        this.noiQuy = noiQuy;
    }

    public int getLanThi() {
        return lanThi;
    }

    public void setLanThi(int lanThi) {
        this.lanThi = lanThi;
    }
     
     void inputInfo(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ho ten hoc vien:");
        name = sc.nextLine();
        System.out.println(" DTk hojv vien");
        dTK = sc.nextDouble();
        System.out.println(" co vi phajm noi quy hay ko? 1:yes or 2:no?");
        noiQuy = sc.nextInt();
        System.out.println(" so ln thi: ");
        lanThi = sc.nextInt();
     }
     
     boolean bong ( double a){
         
          // switch(noiQuy){
                //case 2:
                   if(a/100 >= 75 && lanThi == 1 && noiQuy == 2  ){
            
                        return true;
          
                     }
                    else //
                        return false ;
                   
                   // break;
                //case 1:
                    //return false;
                  //  break;
            //}//
                 
        
         //return true;
     }    
    
    
    public boolean tinhBong(){
         boolean bong = this.bong(dTK);
        dTK = (double) (this.getdTK());
        if( bong == true){
            System.out.println("dat bong ");
        }
        return bong( dTK);
    }
}

