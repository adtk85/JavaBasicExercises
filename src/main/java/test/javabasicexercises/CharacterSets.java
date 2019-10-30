/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.javabasicexercises;

import java.nio.charset.Charset;

/**
 *
 * @author adtk85
 */
public class CharacterSets {
    public static void main(String[] args) {
        System.out.println("List of available character sets: ");  
        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }
    }
    
}
