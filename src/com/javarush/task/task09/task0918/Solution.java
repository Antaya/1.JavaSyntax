package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

import java.io.FileNotFoundException;
import java.net.SocketException;

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException  extends SocketException {
    }

    static class MyException2 extends FileNotFoundException {
    }

    static class MyException3 extends ArithmeticException {
    }

    static class MyException4 extends ArrayIndexOutOfBoundsException {
    }
}

