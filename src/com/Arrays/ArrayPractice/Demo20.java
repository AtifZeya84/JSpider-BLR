package com.Arrays.ArrayPractice;

import java.util.Arrays;

public class Demo20 {
    public static void main(String[] args) {
        int[] a = {2,3,2,4,7,3,2,4};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++){
            if (max < a[i] )  max = a[i];
        }
        System.out.println("Given Array is "+Arrays.toString(a));
        System.out.println("Max Ele of Array "+max);
    }
}
