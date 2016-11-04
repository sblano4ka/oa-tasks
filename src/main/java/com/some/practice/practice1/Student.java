package com.some.practice.practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by User on 11/1/2016.
 */
public class Student implements StudentInterface {

    private String name;
    private String surname;
    private String group;
    private List<Exam> examsList;


    public Student(String name, String surname, String group, List<Exam> examsList) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.examsList = examsList;
    }

    public int getHighestGrade(String name, List<Exam> examListz) throws NullPointerException{
       try{
        examListz.sort((Exam e1, Exam e2) -> e1.getGrade() - e2.getGrade());
        HashMap<String, Integer> map= new HashMap<>();
        for (Exam anExamListz : examListz) {
            map.put(anExamListz.getDiscipline(), anExamListz.getGrade());
        }
        return map.get(name);}
       catch (NullPointerException e){throw new NullPointerException("no such exam");
       }
    }

    public void addGrade(Exam exam, int grade){
        exam.setGrade(grade);
        examsList.add(exam);
    }

    @Override
    public void removeGradeByFaculty(Exam exam, int grade) throws Exception{
        exam.setGrade(grade);
    }
    @Override
    public int countOfExamsByGrade(int grade, List<Exam> examListz){
        ArrayList gradeList = new ArrayList();
        for(Exam exm:examListz){
            gradeList.add(exm.getGrade());
        }
        return Collections.frequency(gradeList,grade);
    }

    @Override
    public int getAverage(){return 0;}
}
