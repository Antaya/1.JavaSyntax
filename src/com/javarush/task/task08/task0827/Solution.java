package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        String date = "MAY 1 2020";
        System.out.println(isDateOdd(date));
    }

    public static boolean isDateOdd(String strDate) throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
            Date newDate = formatter.parse(strDate);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(newDate);

int day = calendar.get(Calendar.DAY_OF_YEAR);
        boolean oddOrEven = true;
        if (day % 2 != 0) {
            oddOrEven = true;

        } else if (day % 2 == 0) {
            oddOrEven = false;
        }


    return  oddOrEven;
    }
}
