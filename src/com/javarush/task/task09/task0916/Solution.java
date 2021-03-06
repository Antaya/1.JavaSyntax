package com.javarush.task.task09.task0916;

import java.io.IOException;
import java.rmi.RemoteException;

/* 
Перехват checked-исключений
*/

public class Solution {
    public static void main(String[] args) {
        handleExceptions(new Solution());

    }

    public static void handleExceptions(Solution obj) {
        try {
            obj.method3();

            obj.method1();
            obj.method2();

        } catch (RemoteException e) {
            System.out.println("RemoteException e");
        } catch (IOException e) {
            System.out.println("IOException e");
        } catch (
                NoSuchFieldException e) {
            System.out.println(" NoSuchFieldException e");


        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
