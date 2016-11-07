package com.some.hw.hw1.interfaces_etc;

/**
 * Created by User on 10/30/2016.
 */
public enum DayOfWeek {
    MONDAY(0), TUESDAY(1), WEDNESDAY(2), THURSDAY(3), FRIDAY(4), SATURDAY(5), SUNDAY(6);

    DayOfWeek(int index) {
        this.index = index;
    }

    private int index;

    public static DayOfWeek valueOf(int index) {
        switch (index) {
            case 0:
                return MONDAY;
            case 1:
                return TUESDAY;
            case 2:
                return WEDNESDAY;
            case 3:
                return THURSDAY;
            case 4:
                return FRIDAY;
            case 5:
                return SATURDAY;
            case 6:
                return SUNDAY;
            default:
                throw new IllegalArgumentException("Day number should be in range of 0-6");
        }
    }
}
