package com.Arrays._1DArray;

import java.util.Arrays;

public class SumOfUnEqualArray {
    public static void main(String[] args) {
        int [] a = {1,5,9,7,8,6};
        int [] b = {1,5,8};
        System.out.println("1st array = " + Arrays.toString(a));
        System.out.println("2st array = " + Arrays.toString(b));
        int l = (a.length < b.length ? a.length : b.length);
        for (int i = 0; i < l; i++){
            if (a.length > b.length)  a[i] = a[i] + b[i];
            else  b[i] = b[i] + a[i];
        }

        if (a.length > b.length)
        System.out.println("sum of two array = " + Arrays.toString(a));
    }
}
