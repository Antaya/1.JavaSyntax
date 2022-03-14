package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine().replaceAll(" ", "");
        char[] letters = string.toCharArray();

        String consonantLetters = "";
        String vowelLetters = "";

        for (int i = 0; i < letters.length; i++) {
            if (isVowel(letters[i])) {
                String v = String.valueOf(letters[i]);
                vowelLetters += v + " ";
            } else {
                String c = String.valueOf(letters[i]);
                consonantLetters += c + " ";
            }
        }

        System.out.println(vowelLetters);


        System.out.println(consonantLetters);
    }


    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}