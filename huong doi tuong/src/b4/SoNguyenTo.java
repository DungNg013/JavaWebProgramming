/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b4;

/**
 *
 * @author Dell E5440
 */
public class SoNguyenTo {
    private int a,b;
    
    public SoNguyenTo() {
    }

    public SoNguyenTo(int a) {
        this.a = a;
        //this.b = b;
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
    
    
     boolean isSNT(int x){
        
        if (x < 2) {
            return false;
        }
        
        int squareRoot = (int) Math.sqrt(x);
        for (int i = 2; i <= squareRoot; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;

        
        
    }
    
     public boolean isSoNguyenTo(){
        boolean isSNT = this.isSNT(a);
        a = this.getA();
        if( isSNT == false){
            System.out.println(" khong phai so nguyen to");  
        }
        else  System.out.println(" " +a);
        return isSNT;
    }
     
     void timSNT(int a){
         //int b;
         for(int j = a; j<2*a; j++){
             if (a < 2) {
            //continue;
                 System.out.println(" khong phai so nguyen to");  
            
        int squareRoot = (int) Math.sqrt(a);
        for (int i = 2; i <= squareRoot; i++) {
            if (a % i == 0) {
                 System.out.println(" khong phai so nguyen to");  
            }
            else 
                a = b;
                System.out.println("  so nguyen to lien ke la: " +b);
         //   retur;
        }
             }
         }
     }
}
        
        
       
       // return false;
             
         
     
//      public boolean timSoNguyenTo(){
//        boolean timSNT = this.timSNT(a);
//        a = this.getA();
//        if( timSNT == true){
//            System.out.println(" so nguyuen to lien tiep la: "+a);  
//        }
//        //else  System.out.println(" " +a);
//        return timSNT;
    
                
     
     
     
     
   
    
    
    

