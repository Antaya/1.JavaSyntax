package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
System.out.println(convertEurToUsd(100, 1.19));
System.out.println(convertEurToUsd(55, 1.19));

    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        //напишите тут ваш код
        double usd = eur * exchangeRate;
        return usd;
    }
}
