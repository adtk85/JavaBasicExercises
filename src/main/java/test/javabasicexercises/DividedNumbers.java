/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.javabasicexercises;

/**
 *
 * @author adtk85
 */
public class DividedNumbers {
    public static void main(String[] args) {
        System.out.println("Divided by 3: ");
        for(int i = 1; i<100; i++)
        {
            if(i%3==0)
                System.out.print(i+",");
        }
        System.out.println("\nDivided by 5: ");
        for(int i = 1; i<100; i++)
        {
            if(i%5==0)
                System.out.print(i+",");
        }
        System.out.println("\nDivided by 3$5: ");
        for(int i = 1; i<100; i++)
        {
            if(i%3==0&&i%5==0)
                System.out.print(i+",");
        }
    }
    
}
