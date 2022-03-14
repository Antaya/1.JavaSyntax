package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Сортировка трех чисел
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

        if (a >= b && b >= c )
            System.out.println(a + " " + b + " " + c);
        else if (b >= a && a >= c)
            System.out.println(b + " " + a + " " + c);
        else if (c >= a && a >= b)
            System.out.println(c + " " + a + " " + b);
        else if (c >= b && b >= a)
            System.out.println(c + " " + b + " " + a);
        else if (a >= c && c >= b)
            System.out.println(a + " " + c + " " + b);
        else if (b >= c && c >= a)
            System.out.println(b + " " + c + " " + a);




    }
}
