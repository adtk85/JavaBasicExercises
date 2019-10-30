/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.javabasicexercises;

import java.util.Scanner;

/**
 *
 * @author adtk85
 */
public class AsciiValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("character to convert to ASCII:");
        char character = input.next().charAt(0);
        int ascii = character;
        System.out.println(ascii);
        
    }
    
}
