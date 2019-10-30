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
public class DigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number:");
        int n = input.nextInt();
        System.out.println("Sum of digits:" + sumDigits(n));
    }    
    public static int sumDigits(int n){
        int sum = 0;
        while(n!=0)
        {
        int r =  n%10;
        n -= r;
        sum += r;
        n /= 10;
        }
        return sum; 
        
    }
}
