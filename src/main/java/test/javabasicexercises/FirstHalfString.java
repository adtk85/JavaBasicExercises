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
public class FirstHalfString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input string");
        String str = input.nextLine();
        if(str.length()%2==0)
        {
            String new_string = str.substring(0,str.length()/2);
            System.out.println(new_string);
        }
        else
            System.out.println("string not even");
    }   
}
