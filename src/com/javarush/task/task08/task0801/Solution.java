package com.javarush.task.task08.task0801;

import java.util.HashSet;
import java.util.Set;

/* 
Set из растений
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
Set<String> food = new HashSet<String>();
food.add("арбуз");
food.add("банан");
        food.add("вишня");
        food.add("груша");
        food.add("дыня");
        food.add("ежевика");
        food.add("женьшень");
        food.add("земляника");
        food.add("ирис");
        food.add("картофель");

        for (String s : food){
            System.out.println(s);
        }
    }
}
