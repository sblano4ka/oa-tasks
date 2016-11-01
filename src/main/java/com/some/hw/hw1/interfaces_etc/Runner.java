package com.some.hw.hw1.interfaces_etc;

/**
 * Created by User on 10/30/2016.
 */
public class Runner {
    public static void main(String[] args) {
        DateImpl date = new DateImpl(8,2,3);
        String s = date.toString();
        System.out.println(s + "  " + date.getDayOfWeek());


       /* date.getDayOfWeek();
        //System.out.println(date.getDayOfWeek(1));
        System.out.println(DayOfWeek.valueOf("MONDAY"));
        for(DayOfWeek day: DayOfWeek.values())
        System.out.println(day.name());
        //DayOfWeek dayOfWeek = new DayOfWeek(1);*/

    }
}
