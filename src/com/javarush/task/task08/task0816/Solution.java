package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("JANUARY 1 2012"));
        map.put("Сирнов", dateFormat.parse("JULY 1 2012"));
        map.put("Смирно", dateFormat.parse("OCTOBER 1 2012"));
        map.put("Петров", dateFormat.parse("AUGUST 1 2012"));
        map.put("Мирнов", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Петро", dateFormat.parse("DECEMBER 1 2012"));
        map.put("Королев", dateFormat.parse("NOVEMBER 1 2012"));
        map.put("Поролев", dateFormat.parse("NOVEMBER 5 2012"));
        map.put("Зарелев", dateFormat.parse("MAY 7  2012"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код

        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            Date value = map.get(key);


            if (value.getMonth() > 4 && value.getMonth() < 8) {
                it.remove();

            }
        }
    }

    public static void main(String[] args) throws ParseException {

    }
}
