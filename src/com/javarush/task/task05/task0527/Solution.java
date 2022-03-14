package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
Dog dog = new Dog("Bob", 15, 5);
Cat cat = new Cat("Tom", "black", 4);
        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //напишите тут ваш код
    public static class Dog {
        private String name;
        private int weigth;
        private int age;


        public Dog(String name, int weigth, int age) {
            this.name = name;
            this.weigth = weigth;
            this.age = age;
        }
    }

    public static class Cat{
        private String name;

        public Cat(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }

        private String color;
        private int age;
    }
}
