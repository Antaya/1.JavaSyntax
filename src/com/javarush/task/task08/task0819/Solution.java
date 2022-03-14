package com.javarush.task.task08.task0819;

import java.util.*;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        List<Cat> list = new ArrayList<>();
        //напишите тут ваш код. step 3 - пункт 3
        Iterator<Cat> it = cats.iterator();
        while (it.hasNext()) {
            list.add(it.next()) ;
        }
        cats.remove(list.get(0));

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    public static class Cat {
// step 1 - пункт 1
    }

}
