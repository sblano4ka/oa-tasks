package com.some.hw.hw2.regexps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by Artem_Iurchenko on 07.11.2016.
 */
public class StringUtils {
    public static String flipString(String string){
        String result = "";
        List<Character> charsList = new ArrayList<>();
        for(int i=string.length()-1;i>=0;i--){
            Character c = string.charAt(i);
            charsList.add(c);
        }
        for (Character aCharsList : charsList) {
            result = result + aCharsList;
        }
        return result;
    }

    public static boolean isStringPalindrome(String string){
        boolean flag=false;
        String result = "";
        String inWork=string.replaceAll(" ","").toLowerCase();
        List<Character> charsList = new ArrayList<>();
        for(int i=inWork.length()-1;i>=0;i--){
            Character c = inWork.charAt(i);
            charsList.add(c);
        }
        for (Character aCharsList : charsList) {
            result = result + aCharsList;
        }
        flag = result.equals(inWork);
        return flag;}


    public static String leftCutRightPad(String string){
        String result="";
        result = string.length() > 10 ? string.substring(0, 5) : String.format("%-12s", string).replace(' ', '0');
        return result;
    }


    public static String flipWordsInString(String string){
        List<String> list = new ArrayList<>();
        String result="";
        String[] words=string.split("\\s");
        Collections.addAll(list, words);
        for (int i = 0; i <list.size() ; i++) {
            String start=list.get(0);
            String end=list.get(list.size()-1);
            list.set(0,end);
            list.set(list.size()-1,start);
        }
        result = list.toString();
        return result;
    }


    public static void flipWordsInSentence(String string){}


    public static boolean isABCcontains(String string){
        return Pattern.matches("\\S[abc]",string);
    }
    public boolean isFormatMMDDYYYY(String string){return false;}
    public boolean isAddress(String string){return true;}
    public int[] findTelephoneNumbers(String string) {
        int []array = new int[0];
        return array;}

    public static void main(String[] args) {
        String toTest="noitca ni gnireenigne esreveR";
        String toTest2="1";
     /*   System.out.println(flipWordsInString("Word with spaces"));
        System.out.println(leftCutRightPad(toTest2));
        System.out.println( flipString(toTest));
        System.out.println(isStringPalindrome(""));*/
        System.out.println(isABCcontains("a b"));
    }
}
