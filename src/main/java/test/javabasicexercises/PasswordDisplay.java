/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.javabasicexercises;

import java.io.Console;

/**
 *
 * @author adtk85
 */
public class PasswordDisplay {
    public static void main(String[] args) {
        Console cons;
        if(((cons = System.console()) != null)){
            char[] pass_word = null;
            try{
                pass_word = cons.readPassword("Input password:");
                System.out.println("your password: " + new String(pass_word));
                       
            }
            finally{
                if(pass_word != null){
                    java.util.Arrays.fill(pass_word,' ');
                }
            }
            
        }
        else{
                    throw new RuntimeException("can't get password, no console");
        }
    }
}
