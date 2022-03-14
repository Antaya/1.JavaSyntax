package com.javarush.task.task04.task0443;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Как назвали, так назвали
*/

public class Solution {
    public static void main(String[] args) throws Exception  {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();

       String number1 = bufferedReader.readLine();
       int year= Integer.parseInt(number1);

      String number2 = bufferedReader.readLine();
       int month = Integer.parseInt(number2);

       String number3 = bufferedReader.readLine();
      int day  = Integer.parseInt(number3);

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + day + "." + month + "." + year);

    }
}
