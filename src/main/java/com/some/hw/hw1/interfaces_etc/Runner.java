package com.some.hw.hw1.interfaces_etc;

/**
 * Created by User on 10/30/2016.
 */
public class Runner {
    public static void main(String[] args) {
        DateImpl date = new DateImpl(10,1,2013);
        DateImpl date2= new DateImpl(10,1,2009);
        DateImpl date3 = new DateImpl(31,12,2006);
        String s = date.toString();

        System.out.println(date.getDayOfYear());
        System.out.println(date2.getDayOfYear());
        System.out.println(s);
        System.out.println(date.daysBetween(date3));
        System.out.println(date2.getDayOfWeek());

        // System.out.println(date.leapYear(year.getYear()));



       /* date.getDayOfWeek();
        //System.out.println(date.getDayOfWeek(1));
        System.out.println(DayOfWeek.valueOf("MONDAY"));
        for(DayOfWeek day: DayOfWeek.values())
        System.out.println(day.name());
        //DayOfWeek dayOfWeek = new DayOfWeek(1);*/

    }
}
