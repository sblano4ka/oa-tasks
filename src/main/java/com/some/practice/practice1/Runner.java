package com.some.practice.practice1;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

/**
 * Created by Artem_Iurchenko on 03.11.2016.
 */
public class Runner {
   /* public int getHighestGrade(String name, List examList, Exam exam){
        examList.sort((Exam e1, Exam e2)->e1.getGrade()-e2.getGrade());
        HashMap<String, Integer> map= new HashMap<>();
        for (Exam exm :examList){
            map.put(exm.getDiscipline(),exm.getGrade());}
        return map.get(name);
    }*/
    public static void main(String[] args) {

        List<Exam> examList = new ArrayList<Exam>();

        Exam exam = new Exam("Nuclear physics",15);
        Exam exam1 = new Exam("Nuclear physics",6);
        Exam exam2 = new Exam("Nuclear physics",10);
        Exam exam3 = new Exam("Atomic",11);
        Exam exam4 = new Exam("Atomic",12);

        examList.add(exam);
        examList.add(exam1);
        examList.add(exam2);
        examList.add(exam3);
        examList.add(exam4);
        exam4.setGrade(4);
       // exam2.setGrade(Integer.parseInt(""));
     //   System.out.println(examList.get(0).toString());

        /*examList.sort((Exam e1, Exam e2)->e1.getGrade()-e2.getGrade());

        HashMap<String, Integer> map= new HashMap<>();
        for (Exam exm:examList){
        map.put(exm.getDiscipline(),exm.getGrade());}
        System.out.println(map.get(exam1.getDiscipline()));//entrySet());*/



        Student student = new Student("John","Smith","F-12");
        System.out.println(student.getHighestGrade(exam4.getDiscipline(),examList));
        student.getExamsList().addAll(examList);

       /* examList.remove(exam.getGrade());
        exam.getDiscipline();
        exam.getGrade();*/
        //переделать все нахер под тесты!


       // int occurrences = Collections.frequency(examList,exam);
        //System.out.println(occurrences);
       // System.out.println(student.getHighestGrade());

       // student.addGrade(exam);
        //student.addGrade(exam1);
       // student.addGrade(exam2);
       /* System.out.println( student.getName() + " " + student.getSurname() + " " + student.getGroup() + " " +" " +
                exam.getDiscipline() + "  " +   exam.getGrade());*/
        for(Exam exm: student.getExamsList()) {
            System.out.println(exm.getDiscipline() + " " + exm.getGrade());
        }

        examList.sort((Exam e1, Exam e2)->e2.getGrade()-e1.getGrade());
        //examList.forEach(System.out::println);
        for(Exam exm: examList){
            System.out.println(exm.getDiscipline() + "  " + exm.getGrade());
        }
    }
}
