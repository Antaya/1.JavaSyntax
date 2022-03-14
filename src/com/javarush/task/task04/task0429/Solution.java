package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Положительные и отрицательные числа
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

        int positiveCount = 0;
        int negativeCount = 0;

        int[] numbers = {a, b, c};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0 && numbers [i] != 0) {
                negativeCount++;

            } else if (numbers[i] > 0 && numbers [i] != 0)
                positiveCount++;


          }
        System.out.println("количество отрицательных чисел: " + negativeCount);
        System.out.println("количество положительных чисел: " + positiveCount);

    }
    }

