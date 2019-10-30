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
public class SignCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Signs to count:");
        String s = input.nextLine();
        count(s);
        
    }

    private static void count(String s) {
        char[] ch = s.toCharArray();
        int l =0;
        int sp = 0;
        int d = 0;
        int ot = 0;
        for(int i = 0; i < s.length();i++)
        {
            if(Character.isLetter(ch[i]))
                l++;
            else if(Character.isSpaceChar(ch[i]))
                sp++;
            else if(Character.isDigit(ch[i]))
                d++;
            else 
                ot++;
        }
        System.out.println("Letters: " + l);
        System.out.println("Spaces: " + sp);
        System.out.println("Digits: " + d);
        System.out.println("Other caracters: " + ot);
    }


    
}
