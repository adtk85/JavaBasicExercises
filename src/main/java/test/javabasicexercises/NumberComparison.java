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
public class NumberComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1st number:");
        int a = input.nextInt();
        System.out.println("2nd number:");
        int b = input.nextInt();
        
        if(a>b)
            System.out.println("1st bigger then 2nd");
        else if(b>a)
            System.out.println("2nd bigger then 1st");
        else 
            System.out.println("1st equals 2nd");
                
                
        
    }
}
