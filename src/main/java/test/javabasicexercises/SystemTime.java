/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.javabasicexercises;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author adtk85
 */
public class SystemTime {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss  yyyy");
        String time1 = format1.format(time);
        System.out.println(time);
        System.out.println(time1);
    }
}
