package com.Arrays.ArrayPractice;

import java.util.Arrays;

public class Demo19 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        for (int i = 0; i < a.length; i++){
            int p = a[i] * a[i];
            a[i] = p;
        }
        System.out.println(Arrays.toString(a));
    }
}
