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
public class InsertWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input sentence:");
        String str = input.nextLine();
        System.out.println("input word");
        String word = input.nextLine();
        System.out.println("input position");
        int pos = input.nextInt();
        String[] sentence = str.split(" ");
        String[] result = new String[sentence.length+1];
        System.arraycopy(sentence, 0, result, 0, pos-1);
        result[pos-1]=word;
        for(int j = pos;j<result.length;j++)
        {
            result[j] = sentence[j-1];
        }
        String final_sentence = "";
        for (String result1 : result) {
            final_sentence += result1 +" ";
        }
        System.out.println(final_sentence);
    }
            
    
}
