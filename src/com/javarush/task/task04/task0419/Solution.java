package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Максимум четырех чисел
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

        String number4 = bufferedReader.readLine();
        int d = Integer.parseInt(number4);

        //if (a == b && b == c && c == d)
        //    System.out.println(a);
         if (a >= b && a >= c && a >= d)
            System.out.println(a);
        else if (b >= a && b >= c && b >= d)
            System.out.println(b);
        else if (c >= a && c >= b && c >= d)
            System.out.println(c);
        else if (d >= a && d >= c && d >= b)
            System.out.println(d);
    }
}
