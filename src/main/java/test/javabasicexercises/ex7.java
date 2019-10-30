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
public class ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number:");
        int a;
        a = input.nextInt();
        for(int i=1;i<11;i++)
            System.out.println(a + " x " + i + " = " + (a*i));
        
       
    }
    
}
