/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd;

import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author Dell E5440
 */
public class HSHocSinh extends Nguoi{
    
       private String lop;
    private String khoaHoc;
    
    public HSHocSinh ()
    {
        
    }
    public HSHocSinh(String hoTen,Date ngaySinh,String queQuan,String lop,String khoaHoc)
    {
        super( hoTen, ngaySinh, queQuan);
        this.lop=lop;
        this.khoaHoc=khoaHoc;
    }
    
       @Override
    public void nhapThongTin()
    {
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ten lop: ");
        this.lop=sc.nextLine();
        System.out.print("Nhap khoa hoc: ");
        this.khoaHoc=sc.nextLine();
    }
       @Override
    public void hienThongTin()
    {
        super.hienThongTin();
        System.out.println("Lop: "+this.lop);
        System.out.println("Khoa hoc: "+this.khoaHoc);
    }
    
    public String getLop()
    {
        return this.lop;
    }

//    void hienThongTin() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
}
