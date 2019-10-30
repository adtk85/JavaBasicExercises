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
public class RectanglePerimeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Width: ");
        double w = input.nextDouble();
        System.out.println("Height: ");
        double h = input.nextDouble();
        double area = w*h;
        double per = 2*(w+h);
      
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + per);
                
    }
    
}
