package com.javarush.task.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Хорошего много не бывает
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String s = bufferedReader.readLine();
        String number = bufferedReader.readLine();
        int numberN = Integer.parseInt(number);
        int times = 1;
        while ( times <= numberN){
            times ++;
            System.out.println(s);
        }
    }
}
