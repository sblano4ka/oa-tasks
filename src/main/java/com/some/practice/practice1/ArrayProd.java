package com.some.practice.practice1;

/**
 * Created by User on 11/1/2016.
 */
public class ArrayProd {
    public static int prod(int[] a) {
        int prod = 0;
        for (int j : a) {
            prod *= j;
        }
        return prod;
    }
}
