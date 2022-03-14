package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        double sumNumbers = 0.0;
        int countNumber = 0;
        int end = -1;
        while (true) {
            String inputNumber = bufferedReader.readLine();
            int number = Integer.parseInt(inputNumber);
            if (number != end) {
                countNumber++;
                sumNumbers += number;
            }else

                break;
        }
        double avgNumbers = sumNumbers / countNumber;
        System.out.println(avgNumbers);
    }
}

