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
public class Employee extends Person{
    private double salary;

    public Employee() {
    }

    public Employee(int salary, String id, String name) {
        super(id, name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
         System.out.println("salary");
        this.salary =sc.nextDouble();
    }
     @Override
    public String toString() {
        return "Student{id=" + this.getId() + ",name=" + this.getName() + ",salary=" + salary + '}';
    }
    
}
