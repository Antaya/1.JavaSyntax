package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Как-то средненько
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


        if (a == b && b == c )
            System.out.println(a);
        else if(a <= b && c >= b || a >= b && c <= b)
            System.out.println(b);
        else if(a >= b && c >= a || a <= b && c <= a)
            System.out.println(a);
        else if(a <= c && c <= b || a >= c && b <=c)
            System.out.println(c);









    }
}
