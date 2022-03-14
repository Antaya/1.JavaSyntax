package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        int res = a + b;
        return res;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        int res = a - b;
        return res;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        int res = a * b;
        return res;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        double res = (double) a / (double) b;
        return res;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        double res = ((double) a * (double) b) / 100;
        return res;
    }

    public static void main(String[] args) {

    }
}