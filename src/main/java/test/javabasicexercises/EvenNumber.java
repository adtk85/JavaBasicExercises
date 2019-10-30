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
public class EvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number:");
        int n = input.nextInt();
        System.out.println("is Even: " + isEven(n));
    }

    private static String isEven(int n) {
        if(n%2==0)
            return "yes";
        else
            return "no";
    }
}
