package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        ArrayList<Integer> dividedIntoThree = new ArrayList<>();
        ArrayList<Integer> dividedIntoTwo = new ArrayList<>();
        ArrayList<Integer> others = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i);
            if (x % 3 == 0 && x % 2 == 0){
                dividedIntoThree.add(x);
                dividedIntoTwo.add(x);
            }
            else if (x % 3 == 0 && x % 2 != 0) {
                dividedIntoThree.add(x);
            } else if (x % 2 == 0 && x % 3 != 0) {
                dividedIntoTwo.add(x);
            } else others.add(x);
        }
        printList(dividedIntoThree);
        printList(dividedIntoTwo);
        printList(others);

    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer x : list) {
            System.out.println(x);
        }
    }
}
