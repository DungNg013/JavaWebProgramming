/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi.n.n.n;

/**
 *
 * @author Dell E5440
 */
public class Ellipsoidal extends Polygon{
    
    private int h;

    public Ellipsoidal() {
    }

    public Ellipsoidal(int h, int a, int b, int c, int d) {
        super(a, b, c, d);
        this.h = h;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    
    
    
}
