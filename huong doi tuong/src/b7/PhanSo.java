/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b7;

import java.util.Scanner;
/**
 *
 * @author Dell E5440
 */
public class PhanSo {
    
    private int numerator;
    private int denominator;
    
    public PhanSo(){
        
    }
    
    public PhanSo(int numerator, int denominator){
        this.denominator =  denominator;
        this.numerator =  numerator;
    }
    
    public int getNumerator(){
        return numerator;
    }
    
     public void setNumerator(int numerator){
         this.numerator =  numerator;
     }
     
      public int getDenominator(){
          return denominator;
      }
      
       public void setDenominatort(int denominator){
           this.denominator = denominator;
       }
    
       public void input(){
           
           Scanner input = new Scanner(System.in);
           System.out.println("Numerator > ");
           this.numerator = input.nextInt();
           System.out.println("denominator > ");
           this.denominator = input.nextInt();
           
       }
       
       public void print(){
           System.out.println(this.numerator + "/" + this.denominator );
       }
       
       public PhanSo reduce(){
           int gcd = this.gcd(numerator,denominator);
          // this.numerator = gcd;
           
        int numerator = this.numerator / gcd;
        int denominator = this.denominator / gcd;
        return new PhanSo(numerator, denominator);
       }
       
       private int gcd(int a, int b){
           
           while( a!= b){
               if(a>b){
                  a = a-b; 
               }
               else{
                   b = b-a;
               }        
           }
           return a;
       }
       
}
