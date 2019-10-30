/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.javabasicexercises;

import static java.lang.Math.*;
import java.util.Scanner;

/**
 *
 * @author adtk85
 */
public class PolygonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of sides:");
        double s = input.nextDouble();
        System.out.println("Side length:");
        double l = input.nextDouble();
        System.out.println("Area: " + polygonArea(s, l));
    }    
    
    public static double polygonArea(double a, double b){
        double area = (a*pow(b,2))/(4*Math.tan(Math.PI/a));
        return area; 
        
    }
}
