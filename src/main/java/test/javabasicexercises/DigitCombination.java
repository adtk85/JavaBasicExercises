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
public class DigitCombination {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.println("1st digit:");
    int a = input.nextInt();
    System.out.println("2nd digit:");
    int b = input.nextInt();
    System.out.println("3rd digit:");
    int c = input.nextInt();
    System.out.println("4th digit:");
    int d = input.nextInt();
    getCombinations(a,b,c,d);
    }

    private static void getCombinations(int a, int b, int c, int d) {
        int amount = 0;
        int[] digits = {a,b,c,d};
        for(int i = 0; i<=3; i++)
            for(int j = 0; j<=3; j++)
                for(int k = 0; k<=3; k++)
                {
                    
                    if(i!=j&i!=k&j!=k)
                    {
                        amount++;
                        System.out.println(digits[i]+""+digits[j]+""+digits[k]);
                                
                    }
                }
        System.out.println("Amount: " + amount);       
    }
    
}
