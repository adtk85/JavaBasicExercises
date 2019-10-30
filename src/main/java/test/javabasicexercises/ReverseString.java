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
public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("String to reverse:");
        String s = input.nextLine();
        System.out.println("Reversed: " + reverseString(s));
    }

    private static StringBuilder reverseString(String s) {
        
        StringBuilder input = new StringBuilder(s);
        StringBuilder result = input.reverse();
        return result;
    }
    
}
