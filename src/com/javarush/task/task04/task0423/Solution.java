package com.javarush.task.task04.task0423;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Фейс-контроль
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader =  new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();

        String number = bufferedReader.readLine();
        int age = Integer.parseInt(number);

        if (age > 20 && age != 20)
            System.out.println("И 18-ти достаточно");


    }
}
