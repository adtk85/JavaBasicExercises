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
public class StringPartFill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input string");
        String str = input.nextLine();
        System.out.println("input signs to show");
        int signs = input.nextInt();
        String output = "";
        if(str.length()>signs-1)
            System.out.println(str.substring(0, signs));
        else{
            char[] charset = new char[signs];
            for(int k=0; k<str.length();k++)
                charset[k] = str.charAt(k);
            for(int i=str.length();i<signs;i++)
                charset[i] = '#';
            for(int j=0; j<signs; j++)
                output += charset[j]; 
            System.out.println(output);
        }
                
    }
}
