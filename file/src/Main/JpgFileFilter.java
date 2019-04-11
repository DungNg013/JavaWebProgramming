package Main;


import java.io.File;
import java.io.FileFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell E5440
 */
public class JpgFileFilter implements FileFilter {
      @Override
    public boolean accept(File pathname) {
 
        if (!pathname.isFile()) {
            return false;
        }
 
        if (pathname.getAbsolutePath().endsWith(".jpg")) {
            return true;
        }
        
        if (pathname.getAbsolutePath().endsWith(".png")) {
            return true;
        }
        
        if (pathname.getAbsolutePath().endsWith(".jpeg")) {
            return true;
        }
 
        return false;
    }
}
