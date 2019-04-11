/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.io.File;
import java.io.FileFilter;

/**
 *
 * @author Dell E5440
 */
public class TxtFileFilter implements FileFilter {
     @Override
    public boolean accept(File pathname) {
 
        if (!pathname.isFile()) {
            return false;
        }
 
        if (pathname.getAbsolutePath().endsWith(".txt")) {
            return true;
        }
 
        return false;
    }
}
