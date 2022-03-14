package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String time = bufferedReader.readLine();
        double t = Double.parseDouble(time);
        if(t % 5 >= 0 && t % 5 < 3)
            System.out.println("зелёный");
        else if(t % 5 >= 3 && t % 5 < 4)
            System.out.println("жёлтый");
        else if(t % 5 >= 4 && t % 5 < 5)
            System.out.println("красный");
    }
}