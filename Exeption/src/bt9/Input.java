/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt9;

import java.util.Scanner;

/**
 *
 * @author Dell E5440
 */
public class Input {
    private Scanner scanner;
    
    public Input(){
        this.scanner = new Scanner(System.in);
    }
    
    public String inputId(){
        String temId = this.scanner.nextLine();
        try{
        if(!temId.matches("HV[0-9]{3}"))
            throw new Exception("Phai bat dau bang HV tieesp theo la ba so");}
        catch(Exception e){
            System.out.println("sai dinh dang");
            System.out.println(e.getMessage());
            return this.inputId();
        }
        return temId;
    }
    public String inputName(){
        String temName = this.scanner.nextLine();
        try{
        if(temName.length() < 8)
            throw new Exception("Phai la ten cos tu 8 ki tu tro len");}
        catch(Exception e){
            System.out.println("sai dinh dang");
            System.out.println(e.getMessage());
            return this.inputName();
        }
        return temName;   
    }
    
    public String inputPhone(){
        String tempPhone = this.scanner.nextLine();
        try{
         if (tempPhone.matches("^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$"))
            throw new Exception("SDT phai co 10 /11 so");}
        catch(Exception e){
            System.out.println("sai dinh dang");
            System.out.println(e.getMessage());
            return this.inputPhone();
        }
       
        return tempPhone;   
    }
    public Double inputMark(){
        Double tempMark = this.scanner.nextDouble();
        try{
        if(tempMark.doubleValue() > 10 || tempMark.doubleValue() < 1  )
            throw new Exception("phai la so trong khoang 1-10");}
        catch(Exception e){
            System.out.println("sai dinh dang");
            System.out.println(e.getMessage());
            return this.inputMark();
        }
         scanner.nextLine();
        return tempMark;   
    }
}
