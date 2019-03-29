/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author Dell E5440
 */
public class Nguoi {
    private String hoTen;
    private Date ngaySinh;
    private String queQuan;
  
    public Nguoi()
    {
        this.ngaySinh=new Date();
    }
    public Nguoi(String hoTen,Date ngaySinh,String queQuan)
    {
        this.hoTen=hoTen;
        this.ngaySinh=ngaySinh;
        this.queQuan=queQuan;
    }
  
    public void nhapThongTin()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        this.hoTen=sc.nextLine();
        System.out.print("Nhap ngay sinh (dd-mm-yyyy): ");
        String ns=sc.nextLine();
        this.ngaySinh=chuyenStringDate(ns);
        System.out.print("Nhap que quan: ");
        this.queQuan=sc.nextLine();
    }
    public void hienThongTin()
    {
         System.out.println("Ho va ten: "+this.hoTen);
         System.out.println("Ngay Sinh: "+this.ngaySinh);
         System.out.println("Que quan: "+this.queQuan);
    }
    public Date chuyenStringDate(String str)
    {
        Date ns=null;
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        try
        {
            ns=sdf.parse(str);
        }catch(Exception e)
        {
            System.out.println("Loi dinh dang ngay thang.!");
        }
        return ns;
    }
    public String getQueQuan()
    {
        return this.queQuan;
    }
    public Date getNgaySinh()
    {
        return this.ngaySinh;
    }

//    void hienThongTin() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
