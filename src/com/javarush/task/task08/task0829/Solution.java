package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();


        List<String> list = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            list.add(family);
            if (family.isEmpty()) {
                break;
            }

        }

        for (int i = 0; i < list.size() - 1; i += 2) {
            map.put(list.get(i), list.get(i + 1));
        }


        System.out.println(map.get(reader.readLine()));


    }
}
