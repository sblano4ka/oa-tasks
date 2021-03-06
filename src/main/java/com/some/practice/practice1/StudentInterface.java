package com.some.practice.practice1;

import java.util.List;

/**
 * Created by User on 11/1/2016.
 */
public interface StudentInterface {

    int getHighestGrade(String name);

    void addGrade(Exam exam, int grade);

    void removeGradeByFaculty(Exam exam, int grade) throws Exception;

    int countOfExamsByGrade(int grade, List<Exam> examListz);

    int getAverage();
}
