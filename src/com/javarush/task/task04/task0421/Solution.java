package com.javarush.task.task04.task0421;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Настя или Настя?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();


        if (name1.equalsIgnoreCase(name2))
            System.out.println("Имена идентичны");
        else if (!name1.equalsIgnoreCase(name2) && name1.length() == name2.length())
            System.out.println("Длины имен равны");

    }
}
