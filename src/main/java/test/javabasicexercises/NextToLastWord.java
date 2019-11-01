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
public class NextToLastWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input sentence");
        String sent = input.nextLine();
        String result = "";
        Scanner sent_scan = new Scanner(sent);
        String word = "";
        String word_last = "";
        while(sent_scan.hasNext())
        {
            word_last = word;
            word = sent_scan.next();
            
        }
        System.out.println(word_last);
    }
    
}
