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
public class GeoLocation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1st latitude:");
        double la1 = input.nextDouble();
        System.out.println("1st longitude:");
        double lo1 = input.nextDouble();
        System.out.println("2nd latitude:");
        double la2 = input.nextDouble();
        System.out.println("2nd longitude:");
        double lo2 = input.nextDouble();
        System.out.println("Distance between points: " + getDistance(la1,lo1,la2,lo2));
    }
    static double getDistance(double a, double b, double c, double d){
        a = Math.toRadians(a);
        b = Math.toRadians(b);
        c = Math.toRadians(c);
        d = Math.toRadians(d);
        double r = 6371.01;
        double distance = r* (Math.acos(Math.sin(a)*Math.sin(c)+Math.cos(a)*Math.cos(c)*Math.cos(b-d)));
        return distance;
    }
}
