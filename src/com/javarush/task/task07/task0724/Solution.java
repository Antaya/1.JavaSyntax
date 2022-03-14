package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandpa = new Human("Федя", true, 86);
        Human grandma = new Human("Оля", false, 80);

        Human father = new Human("Павел", true, 56);
        Human mother = new Human("Катя", false, 55);

        Human father1 = new Human("Павел", true, 56, grandpa, grandma);
        Human mother1 = new Human("Катя", false, 55, grandpa, grandma);
        Human daughter = new Human("Аня", false, 21, father, mother);
        Human son = new Human("Петя", true, 23, father, mother);
        Human son1 = new Human("Миша", true, 15, father, mother);


        System.out.println(grandma + "\n" + grandpa + "\n" + father + "\n" + mother + "\n" + father1 + "\n" + mother1+ "\n" + daughter + "\n" + son + "\n" + son1);

    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human mother;
        Human father;

        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;



        }



        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}