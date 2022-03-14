package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.Buffer;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String inputNumber =  bufferedReader.readLine();
        int number = Integer.parseInt(inputNumber);

        if (number > 0) {
            System.out.println(number * 2);
        }else if (number < 0 ){
            System.out.println(number + 1);
        }else if (number == 0){
            System.out.println(number);
        }

    }

}