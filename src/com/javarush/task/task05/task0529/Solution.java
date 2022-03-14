package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamRader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamRader);
        int sum = 0;
        String end  = "сумма";
        while (true) {

                String input = bufferedReader.readLine();
            if (!input.equals(end)) {
                int number = Integer.parseInt(input);
                sum = sum + number;
            }
                if (input.equalsIgnoreCase(end)) break;
            }


        System.out.println(sum);
    }
}

