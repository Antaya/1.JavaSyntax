package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


HashMap <String, Integer> map = new HashMap<>();
        while (true) {

            String name = reader.readLine();
            if (name == null || name.isEmpty()) {
                break;
            } else {

                int id = Integer.parseInt(reader.readLine());
                map.put(name, id);
            }
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            int value = pair.getValue();
            System.out.print(value);
            System.out.println(key);
        }
    }
}
