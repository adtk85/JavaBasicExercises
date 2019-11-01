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
public class IntegersInRangeDivisable {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter range and the divisable nr:");
            int start = input.nextInt();
            int end = input.nextInt();
            int div = input.nextInt();
            for (int i = start; i <=end; i++)
            {
                if(i%div==0)
                    System.out.println(i);
            }

    }
    
}
