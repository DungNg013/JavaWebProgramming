/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Dell E5440
 */
public class Test {
     public static void main(String[] args) throws Exception
   {
       ArrayList<HSHocSinh> ds;
       int n;
       Scanner sc=new Scanner(System.in);
       try
       {     
           System.out.print("Nhap so luong hoc sinh: ");
           n=sc.nextInt();
           sc.nextLine();
        }catch(Exception e)
        {
            n=1;
        }
       String tl=null;
       ds=new ArrayList<HSHocSinh>(n);
       HSHocSinh b=new HSHocSinh();
       while(true)
       {
           b.nhapThongTin();
           ds.add(b);
           System.out.print("Ban co muon nhap nua khong (c/k): ");
           tl=sc.nextLine();
           if(tl.equalsIgnoreCase("k"))
                break;
       }
       for(int i=0;i<n;i++)
       {
           System.out.println("--------------------");
           ds.get(i).hienThongTin();
           System.out.println("--------------------");
       }
       
       System.out.println("Nhung sinh vien que o thai nguyen va sinh nam 1985 la: ");
       for(int i=0;i<n;i++)
           if((ds.get(i).getNgaySinh().getYear()-1900==1985) && (ds.get(i).getQueQuan().equalsIgnoreCase("Thai Nguyen")))
                ds.get(i).hienThongTin();
        
       System.out.println("Nhung sinh vien hoc lop 10A1 la: ");
       for(int i=0;i<ds.size();i++)
            if(ds.get(i).getLop().equalsIgnoreCase("10A1"))
                ds.get(i).hienThongTin();
    }
    
}
