package com.some.hw1.anonymus_classes;

/**
 * Created by User on 10/30/2016.
 */
public class Runner {
    public static void main(String[] args) {
        DateImpl date = new DateImpl(1,2,3);

        date.getDayOfWeek(1);
        //System.out.println(date.getDayOfWeek(1));
        System.out.println(DayOfWeek.valueOf("MONDAY"));
        for(DayOfWeek day: DayOfWeek.values())
        System.out.println(day.name());
        //DayOfWeek dayOfWeek = new DayOfWeek(1);

    }
}
