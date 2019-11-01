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
public class LastDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("3 numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(lastDigit(a)==lastDigit(b)||lastDigit(a)==lastDigit(c)||lastDigit(c)==lastDigit(b))
            System.out.println(true);
    }
    public static int lastDigit(int x){
        int last;  
        last = x%10;
        return last;
    }
}
