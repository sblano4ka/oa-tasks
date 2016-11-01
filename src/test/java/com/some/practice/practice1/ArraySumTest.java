package com.some.practice.practice1;

import org.junit.*;
import org.junit.rules.ExpectedException;

public class ArraySumTest  {

    static int [] array;
    static ArraySum arraySum;

    @BeforeClass
    public static void setUpFixture() throws Exception {
        array = new int[]{1,2,3,4,5,6};
       arraySum = new ArraySum(array);
    }

    @AfterClass
    public static void tearDownFixture() throws Exception {
        System.out.println("Finishing Testing in ArraySumTest");
    }


    @Test
    public void testSum() throws Exception {

        int actual =0;
        for(int j: array){
            actual+=j;
        }
        int expected = ArraySum.sum(array);
        Assert.assertEquals(actual, expected);
    }

    @Test(expected = NullPointerException.class)
    public void testNullInSum() {
            ArraySum.sum(null);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testNullInSum2() {
        thrown.expect(NullPointerException.class);
        ArraySum.sum(null);
    }

}