/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.javabasicexercises;

import java.io.File;

/**
 *
 * @author adtk85
 */
public class FileSize {
    public static void main(String[] args) {
        File test = new File("test.txt");
        
        System.out.println("test.txt size: " + test.length());
    }
         
    
}
