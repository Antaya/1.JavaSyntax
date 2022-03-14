package com.javarush.task.task04.task0424;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String number1 = bufferedReader.readLine();
        int first = Integer.parseInt(number1);

        String number2 = bufferedReader.readLine();
        int second = Integer.parseInt(number2);

        String number3 = bufferedReader.readLine();
        int third = Integer.parseInt(number3);


        if (first != second && second == third) {
             System.out.print(1);
        }else if (first != second && first == third) {
            System.out.print(2);
        }else if (first == second && second != third) {
            System.out.print(3);
        }
    }
}
