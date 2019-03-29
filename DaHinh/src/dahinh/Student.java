/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dahinh;

import java.util.Scanner;

/**
 *
 * @author Dell E5440
 */
public class Student extends Person{
    private String email;

    public Student() {
    }

    public Student(String email, String id, String name) {
        super(id, name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("email");
        this.email = sc.nextLine();
        
    }
     @Override
    public String toString() {
        return "Student{id=" + this.getId() + "name=" + this.getName() + "email=" + email + '}';
    }
    
}
