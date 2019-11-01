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
public class LowerLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input sentence to lower case:");
        String str = input.nextLine();
        str = str.toLowerCase();
        System.out.println(str);
    }
    
}
