package com.javarush.task.task09.task0921;                                                                                                                                                      
                                                                                                                                                      
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;                                                                                                                                                      
import java.util.List;                                                                                                                                                      
                                                                                                                                                      
/*                                                                                                                                                       
Метод в try..catch                                                                                                                                                      
*/                                                                                                                                                      
                                                                                                                                                      
public class Solution {                                                                                                                                                      
    public static void main(String[] args) {
        readData();
    }

        public static void readData () {
            //напишите тут ваш код
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            List<Integer> list = new ArrayList<>();
            try {
                for (int i = 0; i < 100; i++) {

                    list.add(Integer.parseInt(reader.readLine()));
                }
                } catch (NumberFormatException e) {
                    for (int n : list) {
                        System.out.println(n);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

    }

