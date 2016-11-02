package com.some.practice.practice1;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by User on 11/1/2016.
 */
public class Student implements StudentInterface {

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

    private String name;
    private String surname;
    private String group;
    private List<Exam> examsList;


    public Student(String name, String surname, String group) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.examsList = new LinkedList<Exam>();
    }

    @Override
    public int getHighestGrade(){return 0;}

// divide into separate classes all three

    public void addGrade(Exam exam){
        examsList.add(exam);
    }

    @Override
    public void removeGradeByFaculty() throws Exception{}
    @Override
    public void countOfExamsByGrade(){}
    @Override
    public int getAverage(){return 0;}
}
