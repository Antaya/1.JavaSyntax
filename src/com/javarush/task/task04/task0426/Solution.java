package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String inputNumber = bufferedReader.readLine();
        int number = Integer.parseInt(inputNumber);

        if (number == 0)
            System.out.println("ноль");
        else if ((number > 0) && (number%2 == 0))
            System.out.println("положительное четное число");
        else if ((number > 0) && (number%2 != 0))
            System.out.println("положительное нечетное число");
        else if ((number < 0) && (number%2 == 0))
            System.out.println("отрицательное четное число");
        else if ((number < 0) && (number%2 != 0))
            System.out.println("отрицательное нечетное число");
    }
}
