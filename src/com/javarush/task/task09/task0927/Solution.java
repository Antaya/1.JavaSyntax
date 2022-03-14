package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Cat cat1 = new Cat("Req");
        Cat cat2 = new Cat("Weq");
        Cat cat3 = new Cat("Ooi");
        Cat cat4 = new Cat("BNM");
        Cat cat5 = new Cat("BNH");
        Cat cat6 = new Cat("ERF");
        Cat cat7 = new Cat("kjq");
        Cat cat8 = new Cat("Wxj");
        Cat cat9 = new Cat("Wpae");
        Cat cat10 = new Cat("Wser");




        Map<String, Cat> catMap = new HashMap<>();
        catMap.put(cat1.name, cat1);
        catMap.put(cat2.name, cat2);
        catMap.put(cat3.name, cat3);
        catMap.put(cat4.name, cat4);
        catMap.put(cat5.name, cat5);
        catMap.put(cat6.name, cat6);
        catMap.put(cat7.name, cat7);
        catMap.put(cat8.name, cat8);
        catMap.put(cat9.name, cat9);
        catMap.put(cat10.name, cat10);

    return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> catSet = new HashSet<>();
        Iterator iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            catSet.add(map.get(iterator.next()));
        }
    return catSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
