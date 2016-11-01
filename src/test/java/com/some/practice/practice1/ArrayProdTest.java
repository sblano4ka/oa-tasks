package com.some.practice.practice1;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayProdTest{
    static int [] array;

    @BeforeClass
    public static void setUp() throws Exception {
        array = new int[]{1,2,3,4,5,6};
       // System.out.println("setting up");
    }

    @AfterClass
    public static void tearDown() throws Exception {
        System.out.println("finishing testing in ArrayProdTest");
    }

    @Test
    public void testProd() throws Exception {

        int actual =0;
        for(int j: array){
            actual*=j;
        }
        int expected = ArrayProd.prod(array);
        Assert.assertEquals(actual, expected);
    }
}