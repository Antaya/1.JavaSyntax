package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputNumber = reader.readLine();

        char[] numbers = inputNumber.toCharArray();
        even = 0;
        odd = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                even++;
            if (numbers[i] % 2 != 0)
                odd++;


        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
