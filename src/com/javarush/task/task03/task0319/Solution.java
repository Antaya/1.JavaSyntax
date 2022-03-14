package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String name = bufferedReader.readLine();
        String amountDate = bufferedReader.readLine();
        int amount = Integer.parseInt(amountDate);
        String timeDate = bufferedReader.readLine();
        int time = Integer.parseInt(timeDate);
        System.out.println(name + " " + "получает " + amount + " " + "через" + " " + time + " " + "лет." );

    }
}
