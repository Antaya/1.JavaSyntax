package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<>();
        int[] five = new int[]{3, 2, 1, 99, 100};
        list.add(five);
        int[] two = new int[]{200, 300};
        list.add(two);
        int[] four = new int[]{1, 2, 3, 4};
        list.add(four);
        int[] seven = new int[]{7, 77, 76, 75, 74, 78, 79};
        list.add(seven);
        list.add(new int[0]);
    return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
