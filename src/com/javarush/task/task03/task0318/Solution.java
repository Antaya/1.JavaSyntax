package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sTime = bufferedReader.readLine();

        String name = bufferedReader.readLine();

        int nTime = Integer.parseInt(sTime);
        System.out.println(name + " " + "захватит мир через " + nTime + " лет." + " " + "Му-ха-ха!");

    }
}
