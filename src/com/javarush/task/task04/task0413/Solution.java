package com.javarush.task.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
День недели
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String inputNumber = bufferedReader.readLine();
        int number =  Integer.parseInt(inputNumber);

        if (number == 1){
            System.out.println("понедельник");
        }else if (number == 2){
            System.out.println("вторник");
            }else if (number == 3){
            System.out.println("среда");
            }else if (number == 4){
            System.out.println("четверг");
            }else if (number == 5){
            System.out.println("пятница");
        }else if (number == 6){
            System.out.println("суббота");
        }else if (number == 7){
            System.out.println("воскресенье");
            }else
            System.out.println("такого дня недели не существует");


    }
}