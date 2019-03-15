/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b5;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Dell E5440
 */
public class Triangle {
    
    private int a ;
     private int b ;
      private int c ;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
      
    void inputInfo(){
        
         Scanner sc = new Scanner(System.in);
         System.out.println("moi nhap 3 canh tam giac");
         a= sc.nextInt();
          b= sc.nextInt();
           c= sc.nextInt();
           System.out.println("");
    } 
    
    void kindOf(){
        
            if(b==c&&a==c || a==c&&a==b || b==c&&a==b ){
                if(a==c && c==b){
                    System.out.println(" tam giac deu");
                }
                else
//                     if( a*a == b*b+c+c || b*b==a*a+c*c || c*c==b*b+a*a){
//                         System.out.println("tam giac vuong can");
//                    }
//                     else 
                        System.out.println("tam giac can");
            }
            else{
                if( a*a == b*b+c+c || b*b==a*a+c*c || c*c==b*b+a*a){
                    if(b==c&&a==c || a==c&&a==b || b==c&&a==b)
                     System.out.println("tam giac vuong can");
                    else
                       System.out.println("tam giac vuong");  
                }
                
            }
        
    }
    void chuVi(){
        float chV = a+b+c;
        System.out.println(" "+chV);
        //return chV;
        
    
}
    
    void dienTich(){
        float p = (a+b+c)/2;
        float dT = (float) (sqrt(p*(p-a)*(p-b)*(p-c)));
        System.out.println(" "+dT);
        
    }
    
}
