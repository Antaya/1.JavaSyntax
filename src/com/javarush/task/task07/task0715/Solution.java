package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");



        String buf = list.get(1);
        String buf1 = list.get(2);
        list.set(1, "именно");
        list.set(2, buf);
        list.add("именно");
        list.add(buf1);
        list.add("именно");

for (String s : list){
    System.out.println(s);
}
            //for (int i = 0; i < list.size(); i++){

           // }
    }
}
