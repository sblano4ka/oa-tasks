package com.some.practice.practice1;

/**
 * Created by User on 11/1/2016.
 */
public interface StudentInterface {

     int getHighestGrade();
     void addGrade(Exam exam);
     void removeGradeByFaculty()throws Exception;
     void countOfExamsByGrade();
     int getAverage();
}
