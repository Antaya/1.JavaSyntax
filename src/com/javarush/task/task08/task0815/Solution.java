package com.javarush.task.task08.task0815;

import java.util.*;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> names = new HashMap<>();

        names.put("Топ", "Клоп");
        names.put("Клоп", "Поп");
        names.put("Поп", "Топ");
        names.put("Топи", "Топ");
        names.put("Клопь", "Клоп");
        names.put("Попи", "Клоп");
        names.put("Хлюп", "Поп");
        names.put("Хрюп", "Хлюп");
        names.put("Попов", "Хлюп");
        names.put("Шмяк", "Шляк");

        return names;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int countName = 0;
        for (String value : map.values()) {
            if (value.equalsIgnoreCase(name))
                countName++;

        }

        return countName;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код

        int countLastName = 0;
        for (String key : map.keySet()) {
            if (key.equalsIgnoreCase(lastName))
                countLastName++;

        }
        return countLastName;
    }

    public static void main(String[] args) {

    }
}
