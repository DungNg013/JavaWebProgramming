/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo;
import java.io.Serializable;
//import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

/**
 *
 * @author Dell E5440
 */
public class Student {
    private String roollnumber;
    private String name;
//    private date dob;
    private String email;

    public Student() {
    }

    public Student(String roollnumber, String name, String email) {
        this.roollnumber = roollnumber;
        this.name = name;
        this.email = email;
    }

    public String getRoollnumber() {
        return roollnumber;
    }

    public void setRoollnumber(String roollnumber) {
        this.roollnumber = roollnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" + "roollnumber=" + roollnumber + ", name=" + name + ", email=" + email + '}';
    }
    
    
}
