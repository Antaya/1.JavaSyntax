package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        String min = strings.get(0);
        String max = strings.get(0);
        int lengthMin = strings.get(0).length();
        int lengthMax = strings.get(0).length();
        int indMin = 0;
        int indMax = 0;

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() < lengthMin) {
                min = strings.get(i);
                indMin = strings.indexOf(min);
                break;
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > lengthMax) {
                max = strings.get(i);
                indMax = strings.indexOf(max);
                break;
            }
        }


        if (indMin < indMax) {
            System.out.println(min);

        } else if (indMax < indMin) {
            System.out.println(max);
        }
    }
}

