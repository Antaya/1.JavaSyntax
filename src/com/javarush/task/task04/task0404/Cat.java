package com.javarush.task.task04.task0404;

/* 
Учет котов
*/

public class Cat {
    private static int catsCount = 0;

    public static void addNewCat() {
        //напишите тут ваш код
Cat.catsCount ++;
    }

    public static void main(String[] args) {
Cat cat = new Cat();
addNewCat();
Cat cat1 = new Cat();
addNewCat();

        System.out.println(Cat.catsCount);
    }
}
