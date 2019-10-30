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
public class CharacterPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("int display multiple times:");
        int i = input.nextInt();
        System.out.printf("%d + %d%d + %d%d%d", i,i,i,i,i,i);
    }
}
