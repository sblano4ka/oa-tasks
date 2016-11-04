package com.some.practice.practice1;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem_Iurchenko on 04.11.2016.
 */
public class StudentTest {

 static List<Exam> examList;
 static Exam exam1;
 static Exam exam2;
 static Exam exam;
 static Exam exam3;
 static Exam exam4;
    static Student student;

    @BeforeClass
    public static void setUpFixture() throws Exception {
        examList = new ArrayList<Exam>();
        exam = new Exam("Nuclear physics",15);
        exam1 = new Exam("Nuclear physics",6);
        exam2 = new Exam("Nuclear physics",10);
        exam3 = new Exam("Atomic",11);
        exam4 = new Exam("Atomic",12);
        student =  new Student("John","Smith","F-12");
        examList.add(exam);
        examList.add(exam1);
        examList.add(exam2);
        examList.add(exam3);
        examList.add(exam4);
    }

    @AfterClass
    public static void tearDownFixture() throws Exception {
        System.out.println("Finishing Testing in StudentTest");
    }

    @Test
    public void testHighestGrade() throws NullPointerException {
       int actual = student.getHighestGrade(exam4.getDiscipline(),examList);
        int expected  = exam4.getGrade();
        System.out.println(actual + " " +expected);
        Assert.assertEquals(actual,expected);
    }

    @Test(expected = NullPointerException.class)
    public void testHighestGradeNull() throws NullPointerException {
       student.getHighestGrade(null,examList);
    }

    @Test
    public void testAddGradeForStudent() throws Exception {
        int expected = 5;
        student.addGrade(exam2,expected);
        Assert.assertEquals(exam2.getGrade(),expected);
    }

    @Test
    public void testRemoveGradeForStudent() throws Exception {
        int expected = 0;
        exam1.setGrade(expected);
        Assert.assertEquals(exam1.getGrade(),expected);
    }
}
