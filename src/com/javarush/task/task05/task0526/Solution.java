package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
                //напишите тут ваш код
        Man man1 = new Man("Петя", 40, "Moscow");
        System.out.println(man1);
        Man man2 = new Man("Вася", 30, "Moscow");
        System.out.println(man2);
        Woman woman1 = new Woman("Маша", 38, "London");
        System.out.println(woman1);
        Woman woman2 = new Woman("Катя", 35, "London");
        System.out.println(woman2);
    }

    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;


        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString(){
            return name + " " + age + " " + address;
        }

        //напишите тут ваш код
    }
}