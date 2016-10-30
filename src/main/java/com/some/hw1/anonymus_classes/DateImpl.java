package com.some.hw1.anonymus_classes;

/**
 * Created by User on 10/30/2016.
 */
public class DateImpl implements Date {
    private Day day;
    private Month month;
    private Year year;

    //@TODO Get the fucking pen and get the fucking logic together on the peace of fucking paper you stupid fuck!
    public DateImpl(int day, int month, int year){
        this.day = new Day(day);
        this.month = new Month(month);
        this.year = new Year(year);
    }

    @Override
    public int getDayOfYear() {
        //
        return 0;
    }

    @Override
    public int daysBetween(Object object) {

        return 0;
    }

    @Override
    public DayOfWeek getDayOfWeek() {
        return null;
    }

    static class Year{
        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public Year(int year) {
            this.year = year;
        }

        int year;

        boolean leapYear(int year){
            return ((year % 4 == 0&&year%100!=0)||(year%400==0));
        }


    }
    static class Month {
        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public Month(int month) {
            this.month = month;
        }

        int month;

        public int getDays(int monthNumber, boolean leapYear) {
            switch (monthNumber) {
                case 1:
                    return 31;
                case 2:
                    if (leapYear) {
                        return 29;
                    } else {
                        return 28;
                    }
                case 3:
                    return 31;
                case 4:
                    return 30;
                case 5:
                    return 31;
                case 6:
                    return 30;
                case 7:
                    return 31;
                case 8:
                    return 31;
                case 9:
                    return 30;
                case 10:
                    return 31;
                case 11:
                    return 30;
                case 12:
                    return 31;
                default: return 0;
            }
        }
    }

    static class Day{
        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public Day(int day) {
            this.day = day;
        }

        int day;
    }
}
