package com.some.practice.practice2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 11/8/2016.
 */
public class Runner {
    public static void main(String[] args) {
       // String s = Parser.parseString("E:\\KB\\oracle_academy\\home-tasks-oa\\src\\main\\resources\\baby2008.html","utf-8");
        //System.out.println(s);
        String s = Parser.parseString("E:\\KB\\oracle_academy\\home-tasks-oa\\src\\main\\resources\\source.html","windows-1251");
        //System.out.println(s1);
        //Pattern pattern = Pattern.compile("<tr align=\"right\"><td>(?<position>\\d+)</td><td>(?<mail>\\w+)</td><td>(?<femail>\\w+)</td></tr>");
       // Pattern pattern = Pattern.compile("<tr class=\"item\"><td class=\"middle-td\"><h6 class=\"name\">(?<mail>\\w+)</h6></td></tr>");
        //Pattern pattern = Pattern.compile("<a(?<mail>\\w+)</a>");
        Pattern pattern = Pattern.compile("<a href>(?<position>\\w+)</a>");


        Matcher matcher = pattern.matcher(s);
        while(matcher.find()){
            System.out.println(matcher.group());
            System.out.println(matcher.group("position"));
            System.out.println(matcher.group("mail"));
            System.out.println(matcher.group("female"));
        }
    }
}
