package com.some.practice.practice1;

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
    private Exam exam;


    public Student(String name, String surname, String group) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.examsList = new LinkedList<Exam>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public List<Exam> getExamsList() {
        return examsList;
    }

    public void setExamsList(List<Exam> examsList) {
        this.examsList = examsList;
    }

    /*@Override
    public int getHighestGrade(String examName){

        int occurrences = Collections.frequency(examsList, examName);

        int grade=0;
        examsList.sort((Exam e1, Exam e2)->e2.getGrade()-e1.getGrade());

        for(Exam exam:examsList){
            if(
            exam.getDiscipline().equals(examName)){
                grade=exam.getGrade();
            }
        }
        return grade;
       // return examsList.get(0).getGrade();
        }*/

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

// divide into separate classes all three

    public void addGrade(Exam exam){
        examsList.add(exam);
    }

    @Override
    public void removeGradeByFaculty() throws Exception{

    }
    @Override
    public void countOfExamsByGrade(){}
    @Override
    public int getAverage(){return 0;}
}
