/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dahinh;

/**
 *
 * @author Dell E5440
 */
public abstract class Manager {
    protected Person[] list = null;
    protected int curr = 0;
    public  abstract void add();
    public abstract void show();
    public abstract void search(String name);
    
}
