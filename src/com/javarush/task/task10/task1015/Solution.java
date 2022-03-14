package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
       ArrayList <String> [] lists = new ArrayList[3];
        lists[0]=new ArrayList<>();
        lists[1]=new ArrayList<>();
        lists[2]=new ArrayList<>();
               Collections.addAll(lists[0], "bbbb", "cccc");
                       Collections.addAll(lists[1], "qqqqq", "llllll");
                Collections.addAll(lists[2],"hghgh", "kjjkkj");

        return lists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}