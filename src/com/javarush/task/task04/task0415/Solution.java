package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Правило треугольника
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        int a = Integer.parseInt(s1);
        String s2 = scanner.nextLine();
        int b = Integer.parseInt(s2);
        String s3 = scanner.nextLine();
        int c = Integer.parseInt(s3);
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("Треугольник существует.");
        } else System.out.println("Треугольник не существует.");
    }
}