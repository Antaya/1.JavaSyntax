package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String string = reader.readLine();

        SimpleDateFormat oldFormatter = new SimpleDateFormat("yyyy-MM-dd",Locale.getDefault());
        SimpleDateFormat newFormatter = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        Date date = oldFormatter.parse(string);
        String result = newFormatter.format(date);
        System.out.println(result.toUpperCase());
    }
}
