package com.some.practice.practice1;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;

/**
 * Created by Artem_Iurchenko on 03.11.2016.
 */
public class Runner {
    public static void main(String[] args) {

        List<Exam> examList = new ArrayList<Exam>();

        Exam exam = new Exam("Thermodynamics",15);
        Exam exam1 = new Exam("Crydtalographics",6);
        Exam exam2= new Exam("Nuclear physics",10);
        examList.add(exam);
        examList.add(exam1);
        examList.add(exam2);




        Student student = new Student("John","Smith","F-12");
        student.getExamsList().addAll(examList);

       // student.addGrade(exam);
        //student.addGrade(exam1);
       // student.addGrade(exam2);
        System.out.println( student.getName() + " " + student.getSurname() + " " + student.getGroup() + " " +" " +
                exam.getDiscipline() + "  " +   exam.getGrade());
        for(Exam exm: student.getExamsList()) {
            System.out.println(exm.getDiscipline() + " " + exm.getGrade());
        }
        examList.sort((Exam o1, Exam o2)->o2.getGrade()-o1.getGrade());

       /// Collections.sort(examList,comparingInt(exam.getGrade() - exam1.getGrade());

       // examList.sort(Exam e1, Exam e2)->(e2.getGrade()-exam1.getGrade());
        examList.forEach(System.out::println);
        for(Exam exm: examList){
            System.out.println(exm.getDiscipline() + "  " + exm.getGrade());
        }
    }
}
