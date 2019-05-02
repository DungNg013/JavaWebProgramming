/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.io.File;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
//import java.util.Date;
    
/**
 *
 * @author Dell E5440
 */
public class Main {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
       
        File f = new File("D:\\picture");
//       if (f.isDirectory()) {
        
           File[] ch = f.listFiles();
            for (File file : ch) {
                if(file.isFile())
                    System.out.print(file.getAbsolutePath());   
                        int sizeOfFile = (int) Math.round(file.length()/1000);
                         System.out.println(" /Size: " + sizeOfFile + "kb");
       }
            System.out.println("----------------------");
           File[] che = f.listFiles();
            for (File file : che) {
                if(!file.isFile())
                    System.out.println(file.getAbsolutePath());
            }  
              
             System.out.println("----------------------");
            File[] txtFiles = f.listFiles(new TxtFileFilter());
 
        for (File txtFile : txtFiles) {
            System.out.println(txtFile.getAbsolutePath());
        }
        
              System.out.println("----------------------");
            File[] jpgFiles = f.listFiles(new JpgFileFilter());
 
        for (File jpgFile : jpgFiles) {
            System.out.println(jpgFile.getAbsolutePath());
        }
//    }
}
}
 
 
    

////       
    

        
    


    
    
    


   
 
