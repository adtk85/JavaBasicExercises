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
public class CapLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input sentence");
        String sent = input.nextLine();
        String result = "";
        Scanner sent_scan = new Scanner(sent);
        while(sent_scan.hasNext())
        {
            String word = sent_scan.next();
            result += Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
        }
        System.out.println(result);
    }
    
}
