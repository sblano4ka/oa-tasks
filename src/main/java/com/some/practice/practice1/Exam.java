package com.some.practice.practice1;

/**
 * Created by User on 11/2/2016.
 */
public class Exam {
    private String discipline;
    private int grade;

    public Exam(String discipline, int grade) {
        this.discipline = discipline;
        this.grade = grade;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}