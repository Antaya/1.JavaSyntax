package com.javarush.task.task04.task0425;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Цель установлена!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String number1 = bufferedReader.readLine();
        int pointFirst = Integer.parseInt(number1);

        String number2 = bufferedReader.readLine();
        int pointSecond = Integer.parseInt(number2);

        if (pointFirst > 0 && pointSecond > 0)
            System.out.println(1);
        else if (pointFirst < 0 && pointSecond > 0)
            System.out.println(2);
        else if (pointFirst < 0 && pointSecond < 0)
            System.out.println(3);
        else if (pointFirst > 0 && pointSecond < 0)
            System.out.println(4);

    }
}
