package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] houses = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < houses.length; i++) {
            houses[i] = Integer.parseInt(reader.readLine());
        }
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < houses.length; i += 2) {
            sumEven += houses[i];
        }
        for (int i = 1; i < houses.length; i += 2) {
            sumOdd += houses[i];
        }

        if (sumEven > sumOdd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else if (sumOdd > sumEven) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");

        }
    }
}