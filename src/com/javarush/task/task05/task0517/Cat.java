package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    private String name = null;
    private int weight;
    private int age;
    private String color;
    private String address = null;


    public Cat(String name) {
        this.name = name;
        this.weight = 3;
        this.age = 2;
        this.color = " ";

    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = " ";

    }

    public Cat(String name, int age) {
        this.name = name;
        this.weight = 3;
        this.age = age;
        this.color = " ";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.age = 2;
        this.address = null;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.age = 2;
        this.address = address;
    }


    public static void main(String[] args) {

    }
}
