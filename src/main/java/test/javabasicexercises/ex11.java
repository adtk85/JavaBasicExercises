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
public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Radius: ");
        double r = input.nextDouble();
        System.out.println("Perimeter: " + (Math.PI*2*r));
        System.out.println("Area: " + (Math.PI*r*r));
                
    }
    
}
