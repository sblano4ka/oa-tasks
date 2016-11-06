package com.some.practice.practice1;

import org.junit.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Created by Artem_Iurchenko on 04.11.2016.
 */
public class StudentTest {

    List<Exam> examList;
    Exam exam1;
    Exam exam2;
    Exam exam;
    Exam exam3;
    Exam exam4;
    Student student;
    Random random;

    @Before
    public void setUpFixture() throws Exception {
        random = new Random();
        examList = new ArrayList<Exam>();
        exam = new Exam("Nuclear physics", 10);
        exam1 = new Exam("Nuclear physics", 11);
        exam2 = new Exam("Nuclear physics", 9);
        exam3 = new Exam("Atomic", 6);
        exam4 = new Exam("Atomic", 5);
        examList.add(exam);
        examList.add(exam1);
        examList.add(exam2);
        examList.add(exam3);
        examList.add(exam4);
        student = new Student("John", "Smith", "F-12", examList);
    }

    @AfterClass
    public static void tearDownFixture() throws Exception {
        System.out.println("Finishing Testing in StudentTest");
    }

    @Test()
    public void testHighestGrade() throws NullPointerException {
        int actual = student.getHighestGrade(exam3.getDiscipline());
        int expected = exam3.getGrade();
        System.out.println(actual + " " + expected);
        Assert.assertEquals(actual, expected);
    }

    @Test(expected = NullPointerException.class)
    public void testHighestGradeNull() throws NullPointerException {
        student.getHighestGrade(null);
    }

    @Test
    public void testAddGradeForStudent() throws Exception {
        int expected = 5;
        student.addGrade(exam2, expected);
        Assert.assertEquals(exam2.getGrade(), expected);
    }

    @Test
    public void testRemoveGradeForStudent() throws Exception {
        int expected = 0;
        int original = exam1.getGrade();
        student.removeGradeByFaculty(exam1, expected);
        Assert.assertEquals(exam1.getGrade(), expected);
    }


    @Test
    public void testCountOfExamsByGrade() throws Exception {
        student.countOfExamsByGrade(random.nextInt(10), examList);
    }
}
