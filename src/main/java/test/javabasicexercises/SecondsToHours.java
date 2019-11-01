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
public class SecondsToHours {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Seconds: ");
        int seconds = input.nextInt();
        int total_minutes = seconds/60;
        int final_seconds = seconds%60;
        int final_minutes = total_minutes%60;
        int final_hours = total_minutes/60;
        System.out.println(final_hours + ":" + final_minutes + ":" + final_seconds);
    }
}
