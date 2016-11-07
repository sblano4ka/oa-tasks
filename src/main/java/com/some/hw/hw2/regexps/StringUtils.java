package com.some.hw.hw2.regexps;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem_Iurchenko on 07.11.2016.
 */
public class StringUtils {
    public static String flipString(String string){
        String result = "";
        List<Character> charsList = new ArrayList<>();
        for(int i=string.length()-1;i>=0;i--){
            Character c = string.toLowerCase().charAt(i);
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


    public void leftCutRightPad(String string){}
    public void flipWordsInString(String string){}
    public void flipWordsInSentence(String string){}
    public boolean isABCcontains(String string){return true;}
    public boolean isFormatMMDDYYYY(String string){return false;}
    public boolean isAddress(String string){return true;}
    public int[] findTelephoneNumbers(String string) {
        int []array = new int[0];
        return array;}

    public static void main(String[] args) {
        String toTest="!hcuo";


        System.out.println( flipString(toTest));
        System.out.println(isStringPalindrome("А роза упала на лапу Азора"));
    }
}
