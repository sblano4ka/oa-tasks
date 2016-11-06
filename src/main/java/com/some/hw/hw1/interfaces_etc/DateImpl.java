package com.some.hw.hw1.interfaces_etc;

/**
 * Created by User on 10/30/2016.
 */
public class DateImpl implements Date {
    private final static DateImpl dateImpl=new DateImpl(31,12,2006);
    private Day day;
    private Month month;
    private Year year;

    public Day getDay() {
        return day;
    }

    public Month getMonth() {
        return month;
    }

    public Year getYear() {
        return year;
    }

    public boolean leapYear(){
        return year.isLeapYear();
    }

    //@TODO Get logic together
    public DateImpl(int day, int month, int year){
        this.day = new Day(day);
        this.month = new Month(month);
        this.year = new Year(year);
    }
    @Override
    public String toString() {
        return "DateImpl{" +
                "day=" + day.getDay() +
                ", month=" + month.getMonth() +
                ", year=" + year.getYear() +
                '}';
    }

    @Override
    public int getDayOfYear() {
        int count = 0;
        for (int i = 1; i <month.getMonth(); i++) {
            Month month = new Month(i);
            count+=month.getDays(year.isLeapYear());
        }
        count=count+day.getDay();
        return count;
    }

    @Override
    public int daysBetween(DateImpl date) {
        int diff=0;
        int yeardiff=(Math.abs((date.getYear().getYear()- this.getYear().getYear())))-1;
        int leapcount=0;
        int max=Math.max(date.getYear().getYear(), this.getYear().getYear());
        int min = Math.min(date.getYear().getYear(), this.getYear().getYear());

        int days_count=0;
        if (yeardiff>0) {
            for(int i=min; i<max; i++ ){
                if(new Year(i).isLeapYear()){leapcount++;}
            }

            if (this.getYear().isLeapYear()) {
                days_count = (366*yeardiff);
            } else {
                days_count = (365*yeardiff);
            }
            int o =this.getDayOfYear();
            int a=(days_count+o);
            int b=date.getDayOfYear();
            diff=Math.abs((a+leapcount)+(365-b));

        }
            else{diff=Math.abs(date.getDayOfYear() - this.getDayOfYear());}
        return diff;
    }

    @Override
    public DayOfWeek getDayOfWeek() {
        System.out.println("Between: " + this.daysBetween(dateImpl));
        return DayOfWeek.valueOf(this.daysBetween(dateImpl)%7-1);
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

        public boolean isLeapYear(){
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

        public int getDays( boolean isLeapYear) {
            switch (month) {
                case 1:
                    return 31;
                case 2:
                    if (isLeapYear) {
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
