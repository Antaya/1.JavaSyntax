package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Положительное число
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

        String number3 = bufferedReader.readLine();
        int c = Integer.parseInt(number3);

        if ((a > 0) && (b > 0) && (c > 0))
            System.out.println(3);
        else if ((a > 0) && (b > 0) && (c <= 0))
            System.out.println(2);
        else if ((a <= 0) && (b <= 0) && (c > 0))
        System.out.println(1);
        else if ((a <= 0) && (b > 0) && (c > 0))
            System.out.println(2);
        else if ((a <= 0) && (b > 0) && (c <= 0))
            System.out.println(1);
        else if ((a > 0) && (b <= 0) && (c <= 0))
            System.out.println(1);
        else if ((a > 0) && (b <= 0) && (c > 0))
            System.out.println(2);
        else if ((a <= 0) && (b <= 0) && (c <= 0))
            System.out.println(0);







    }
}
