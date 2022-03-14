package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        int maximum = max(strings);
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == maximum)
                System.out.println(strings.get(i));

        }

    }

    public static int max(ArrayList<String> strings) {
        int maximum = strings.get(0).length();
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > maximum) {
                maximum = strings.get(i).length();
            }
        }
        return maximum;
    }

}
