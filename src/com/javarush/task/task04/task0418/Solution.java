package com.javarush.task.task04.task0418;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String number1 = bufferedReader.readLine();
        int a = Integer.parseInt(number1);

        String number2 = bufferedReader.readLine();
        int b = Integer.parseInt(number2);

        if (a <= b)
            System.out.println(a);
        else System.out.println(b);
    }
}