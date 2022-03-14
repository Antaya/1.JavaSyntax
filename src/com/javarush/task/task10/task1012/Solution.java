package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }
        int count = 0;


        List<Character> letters = new ArrayList<>();

        for (String string : list) {
            for (char ch : string.toCharArray()) {
                if (alphabet.contains(ch))
                    letters.add(ch);
            }

        }
        Collections.sort(letters);

        for (Character symbol : alphabet) {
            count = 0;
            for (char elem : letters) {
                if (symbol.equals(elem)) {
                    count++;
                }
            }
            System.out.println(symbol + " " + count);
        }


    }

}
// напишите тут ваш код





