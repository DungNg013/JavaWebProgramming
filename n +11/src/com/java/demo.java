/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Dell E5440
 */
public class demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        List<String> list = new ArrayList<>();
//        list.add("hi");
//        list.add("hi");
//        list.add("na");
//        list.add("hi");
//        list.add("hi");
//        System.out.println(list.size());
//        System.out.println(list.get(0));
//        list.remove("hi");
//        System.out.println(list.size());
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//            
//        }
//        System.out.println(list.indexOf("na"));
//        
        
        List<Student> st = new ArrayList<>();
        st.add(new Student(1, "An"));
         st.add(new Student(2, "Ln"));
//         boolean remove = st.remove(new Student(2, "Ln"));
//         System.out.println(remove);
         for(Student s:st){
             System.out.println(s);
         }
         
         Vector<String> v = new Vector<>();
         v.addElement("hi2");
         v.add("na2");
         System.out.println(v.elementAt(0));
         System.out.println(v.get(1));
         for (String v1 : v) {
             
             System.out.println(v1);
         }
         
         LinkedList<String> LinkedList = new LinkedList<>();
         LinkedList.add("Mi");
         LinkedList.add("Vi");
         System.out.println(LinkedList.size());
         for (String li : LinkedList) {
             System.out.println(li);
        }
            
        }
         
        
    }
    

 