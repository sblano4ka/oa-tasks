package com.some.hw.hw1.interfaces_etc;

/**
 * Created by User on 10/30/2016.
 */
public interface Date {
    public int getDayOfYear();

    public int daysBetween(DateImpl date);

    public DayOfWeek getDayOfWeek();
}
