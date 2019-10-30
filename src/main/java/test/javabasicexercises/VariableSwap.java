/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.javabasicexercises;

import java.util.Scanner;

/**
 *
 * @author CLEVO Computer
 */
public class VariableSwap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Var1: ");
        String a = input.nextLine();
        System.out.println("Var2: ");
        String b = input.nextLine();
        String temp = a;
        a=b;
        b=temp;
        System.out.println("Var1: " + a + "Var2: " + b);
        
        
                
    }
    
}
