/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m;



/**
 *
 * @author Dell E5440
 */
public class Camera extends Product{
   
    private boolean hasWifi;

    public Camera() {
        
    }

    public Camera(boolean hasWifi, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.hasWifi = hasWifi;
    }
    
    @Override
    public void addNew(){
        super.addNew();
        System.out.println("Co wifi ko? (1/0)");
        int c = sc.nextInt();
        if(c==1){
            hasWifi = true;
        }
        else{
            hasWifi = false;
        }
    }

    @Override
    public String toString() {
        return "Camera{" + "hasWifi=" + hasWifi + '}';
    }
    
    
     
    
}
