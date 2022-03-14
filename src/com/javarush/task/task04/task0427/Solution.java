package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String inputNumber = bufferedReader.readLine();

        int number = Integer.parseInt(inputNumber);

        if (number >= 1 && number <= 999){
            if ((number%2 == 0) && (number < 10))
                System.out.println("четное однозначное число");
            else if ((number%2 == 0) && (number >= 10) && (number <= 99))
                System.out.println("четное двузначное число");
            else if ((number%2 == 0) && (number > 99))
                System.out.println("четное трехзначное число");
            else if ((number%2 != 0) && (number < 10))
                System.out.println("нечетное однозначное число");
            else if ((number%2 != 0) && (number >= 10) && (number <= 99))
                System.out.println("нечетное двузначное число");
            else if ((number%2 != 0) && (number > 99))
                System.out.println("нечетное трехзначное число");
                    }

    }
}
