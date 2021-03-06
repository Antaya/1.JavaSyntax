package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        int minimum = min(strings);
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == minimum)
                System.out.println(strings.get(i));

        }

    }

    public static int min (ArrayList<String> strings) {
        int min = strings.get(0).length();
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() < min) {
                min = strings.get(i).length();
            }
        }
        return min;
    }

}



