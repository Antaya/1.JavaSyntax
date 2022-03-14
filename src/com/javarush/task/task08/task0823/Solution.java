package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine().trim();

        String[] subString = string.split(" +");


        for (int i = 0; i < subString.length; i ++){
subString[i] = subString[i].substring(0, 1).toUpperCase() + subString[i].substring(1);
        }




        // Вывод на экран
        for(int i = 0; i < subString.length; i++) {
            System.out.print(subString[i] + " ");
        }


        //напишите тут ваш код
    }
}
