package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Brom0", 200);
        map.put("Brom1", 600);
        map.put("Brom2", 300);
        map.put("Brom3", 700);
        map.put("Brom4", 500);
        map.put("Brom5", 400);
        map.put("Brom6", 100);
        map.put("Brom7", 6000);
        map.put("Brom8", 200);
        map.put("Brom9", 200);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }


    }

    public static void main(String[] args) {

    }
}