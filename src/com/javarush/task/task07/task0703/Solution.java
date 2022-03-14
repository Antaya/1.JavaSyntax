package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] list = new String[10];
        int[] nums = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < list.length; i++){
            String s = reader.readLine();
            list[i] = s;
        }

        for (int i = 0; i < nums.length; i++){

            nums[i] = list[i].length();
        }
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
