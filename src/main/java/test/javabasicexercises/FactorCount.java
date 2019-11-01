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
public class FactorCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input number to count factors:");
        int num = input.nextInt();
        int factor_count = 0;
        for(int i = 1; i<=num;i++)
        {
            if(num%i==0)
                factor_count++;
        }
        System.out.println(factor_count);    
    }
    
}
