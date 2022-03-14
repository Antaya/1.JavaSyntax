package com.javarush.task.task08.task0824;

import java.lang.reflect.Array;
import java.util.*;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код4

        Human son1 = new Human("Мотя", true, 23, new ArrayList<>());
        Human son2 = new Human("Ваня", true, 22, new ArrayList<>());
        Human son3 = new Human("Родя", true, 21, new ArrayList<>());


        Human mama = new Human("Катя", false, 45, new ArrayList<>(Arrays.asList(son1, son2, son3)));

        Human papa = new Human("Паша", true, 46, new ArrayList<>(Arrays.asList(son1, son2, son3)));


        Human grandpa1 = new Human("Петя", true, 76, new ArrayList<Human>(Arrays.asList(mama)));
        Human grandma1 = new Human("Мария", false, 70, new ArrayList<Human>(Arrays.asList(mama)));
        Human grandpa2 = new Human("Федя", true, 77, new ArrayList<Human>(Arrays.asList(papa)));
        Human grandma2 = new Human("Ольга", false, 69, new ArrayList<Human>(Arrays.asList(papa)));



    }

    public static class Human {

        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;

        //напишите тут ваш код


        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
            System.out.println(this.toString());
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();

            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }


            }
            return text;
        }
    }
}
