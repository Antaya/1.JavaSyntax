package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int i = 1;
        int maximum = 0;
        //напишите тут ваш код
        if (n > 0) {
            while (i <= n) {
                if (i == 1)
                    maximum = Integer.parseInt(reader.readLine());

                if (i > 1) {
                    int a = Integer.parseInt(reader.readLine());
                    maximum = a > maximum ? a : maximum;
                }
                    i++;
                }

            System.out.println(maximum);
            }



        }
    }
