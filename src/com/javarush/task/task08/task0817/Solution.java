package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Петров1", "Иван");
        map.put("Петров2", "Иван1");
        map.put("Петров3", "Иван");
        map.put("Петров4", "Иван1");
        map.put("Петров5", "Иван");
        map.put("Петров6", "Иван3");
        map.put("Петров7", "Иван");
        map.put("Петров8", "Иван4");
        map.put("Петров9", "Иван");
        map.put("Петров10", "Иван5");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        List<String> list = new ArrayList<>();

        for (String value : map.values()) {
            list.add(value);

        }
        for (String s : list) {
            int freq = Collections.frequency(list, s);
            if (freq > 1) {
                removeItemFromMapByValue(map, s);
            }
        }
    }


    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
