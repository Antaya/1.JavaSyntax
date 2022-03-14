package com.javarush.task.task04.task0422;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
18+
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name =  bufferedReader.readLine();
        String number =  bufferedReader.readLine();
        int age = Integer.parseInt(number);


        if (age < 18) System.out.println("Подрасти еще");
    }
}
