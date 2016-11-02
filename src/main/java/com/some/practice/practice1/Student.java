package com.some.practice.practice1;

import java.util.ArrayList;
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

    public Student(String name, String surname, String group, List examsList) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.examsList = examsList;
    }

    @Override
    public int getHighestGrade(){return 0;}

// divide into separate classes all three
    @Override
    public void addGrade(Object object){
        List<Object> list = new LinkedList<Object>();
        list.add(object);
    }
    @Override
    public void removeGradeByFaculty() throws Exception{}
    @Override
    public void countOfExamsByGrade(){}
    @Override
    public int getAverage(){return 0;}


    private class Exam{
        public Exam(String discipline, int grade) {
            this.discipline = discipline;
            this.grade = grade;
        }

        private String discipline;
        private int grade;

    }

    private class Group{
        public Group(String course, String faculty) {
            this.course = course;
            this.faculty = faculty;
        }
        private String course;
        private String faculty;
    }
}
