package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private String middleName;
        private String surname;
        private boolean sex;
        private int age;
        private String profession;

        public Human() {
        }


        public Human(String name, String middleName, String surname) {
            this.name = name;
            this.middleName = middleName;
            this.surname = surname;
        }

        public Human (String name, String surname){
            this.name = name;
            this.surname = surname;
        }



        public Human (String name, boolean sex){
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, String middleName, String surname, boolean sex) {
            this.name = name;
            this.middleName = middleName;
            this.surname = surname;
            this.sex = sex;
        }
        public Human (String name, String surname, boolean sex){
            this.name = name;
            this.surname = surname;
            this.sex = sex;
        }

        public Human (String name, String surname, boolean sex, String profession){
            this.name = name;
            this.surname = surname;
            this.sex = sex;
            this.profession = profession;
        }


        public Human(String name, String middleName, String surname, boolean sex, int age) {
            this.name = name;
            this.middleName = middleName;
            this.surname = surname;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, String middleName, String surname, boolean sex, int age, String profession) {
            this.name = name;
            this.middleName = middleName;
            this.surname = surname;
            this.sex = sex;
            this.age = age;
            this.profession = profession;
        }

        public Human (String surname,  boolean sex, String profession){
            this.surname = surname;
            this.sex = sex;
            this.profession = profession;
        }


    }
}
