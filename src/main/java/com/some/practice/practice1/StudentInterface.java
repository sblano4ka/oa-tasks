package com.some.practice.practice1;

import java.util.List;

/**
 * Created by User on 11/1/2016.
 */
public interface StudentInterface {

     int getHighestGrade(String name, List<Exam> examListz);
     void addGrade(Exam exam, int grade);
     void removeGradeByFaculty()throws Exception;
     void countOfExamsByGrade();
     int getAverage();
}
