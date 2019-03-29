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
public class SmartPhone extends Product{
    
    
    private boolean hasCamara;
   
    private int sim;

    public SmartPhone() {
        super();
    }

    public SmartPhone(boolean hasCamara, int sim, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.hasCamara = hasCamara;
        this.sim = sim;
    }

    public boolean isHasCamara() {
        return hasCamara;
    }

    public void setHasCamara(boolean hasCamara) {
        this.hasCamara = hasCamara;
    }

    public int getSim() {
        return sim;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }
    
    @Override
    public void addNew(){
        super.addNew();
        System.out.println("Co camera ko? (1/0)");
        int c = sc.nextInt();
        if(c==1){
            hasCamara = true;
        }      
        else{
              hasCamara = false;        
         }
        System.out.println("Sim: (1/2)");
        sim = sc.nextInt();
        sc.nextLine();
            
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    

 
   
    
    

    
}
