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
public class StringInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert string number");
        String str = input.nextLine();
        int i = Integer.parseInt(str);
        System.out.println(i);
            
    }
    
}
