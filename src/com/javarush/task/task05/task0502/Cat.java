package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }



    public boolean fight(Cat anotherCat) {

        //напишите тут ваш код
        int countCat1 = 0;
        int countCat2 = 0;
        if (this.age > anotherCat.age) countCat1++;
        else if (this.age < anotherCat.age) countCat2++;
        if (this.strength > anotherCat.strength) countCat1++;
        else if (this.strength < anotherCat.strength) countCat2++;
        if (this.weight > anotherCat.weight) countCat1++;
        else if (this.weight < anotherCat.weight) countCat2++;

        return countCat1 > countCat2;

    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.age = 2;
        cat2.age = 2;
        cat1.strength = 2;
        cat2.strength =2;
        cat1.weight = 2;
        cat2.weight = 2;
        System.out.println(cat1.fight(cat2));


    }
}
