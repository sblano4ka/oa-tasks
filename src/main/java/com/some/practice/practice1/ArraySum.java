package com.some.practice.practice1;

/**
 * Created by User on 11/1/2016.
 */
public class ArraySum {
    int[] data;

    public ArraySum(int[] array) {
        this.data = array;
        sum(array);
    }

    public static int sum(int[] a) {
        int sum = 0;
        for (int j : a) {
            sum += j;
        }
        //  System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArraySum arraySum = new ArraySum(array);
        System.out.println(arraySum);
        System.out.println(sum(array));
    }
}