package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
Set<Integer> set = new HashSet<>();
        Random random = new Random();
        while (set.size() < 20){
        set.add(random.nextInt(30));
}
   return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код

        set.removeIf(x -> x > 10);


   return set;
    }

    public static void main(String[] args) {

    }
}
