package com.javarush.task.task04.task0436;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Рисуем прямоугольник
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String number1 = bufferedReader.readLine();
        int m = Integer.parseInt(number1);

        String number2 = bufferedReader.readLine();
        int n = Integer.parseInt(number2);

        for (int i = 1; i <= m; i++) {

          for (int j  = 1; j <= n; j ++){
          System.out.print(8);}
          System.out.println();
        }

    }
}
