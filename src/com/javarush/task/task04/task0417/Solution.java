package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String number1 = bufferedReader.readLine();
        int a = Integer.parseInt(number1);

        String  number2 = bufferedReader.readLine();
        int b = Integer.parseInt(number2);

        String number3 = bufferedReader.readLine();
        int c = Integer.parseInt(number3);

        if (a == b && a == c ){
            System.out.println(a + " " + b + " " + c);
            }
        else if (a == b && a != c){
            System.out.println(a + " " + b);

        }else if (b == c && b != a){
            System.out.println(b + " " + c);
        }else if (a == c && a != b){
            System.out.println(a + " " + c);
        }


    }
}