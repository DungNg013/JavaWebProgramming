/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b7;


/**
 *
 * @author Dell E5440
 */
public class main {
    
        
         private static int sum = 0;
    public static int add(int a, int b) {
        return a+b;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PhanSo b = new PhanSo(12, 16);
        b.print();
        PhanSo reduce = b.reduce();
       // b.print();
        reduce.print();
    //
}
        
    }

