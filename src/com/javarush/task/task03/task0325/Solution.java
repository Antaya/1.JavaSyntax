package com.javarush.task.task03.task0325;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamResder = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamResder);

        String salaryString = bufferedReader.readLine();
        int salary = Integer.parseInt(salaryString);

        System.out.println("Я буду зарабатывать $" + salary + " в час");
    }
}
