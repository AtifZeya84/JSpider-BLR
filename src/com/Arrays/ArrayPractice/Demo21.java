package com.Arrays.ArrayPractice;

import kotlin.UNINITIALIZED_VALUE;

import java.util.Arrays;

public class Demo21 {
    public static void main(String[] args) {
        int[] a = {4,6,2,8,1,1,8};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++){
            if (min > a[i] )  min = a[i];
        }
        System.out.println("Given Array is "+Arrays.toString(a));
        System.out.println("Min Ele is " + min);
    }
}
