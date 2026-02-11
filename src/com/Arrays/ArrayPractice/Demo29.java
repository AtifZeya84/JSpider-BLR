package com.Arrays.ArrayPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo29 {
    public static void main(String[] args) {
        int[] a = {2,3,4,1};
        int[] b = {4,6,9,7,7,8,9};
        System.out.println("Array A " + Arrays.toString(a));
        System.out.println("Array B " + Arrays.toString(b));
        if (a.length<b.length){
            for (int i = 0; i < a.length; i++){
                b[i] = a[i] + b[i];
            }
            System.out.println("Sum of two arrays "+Arrays.toString(b));
        }
        else{
            for (int i = 0; i < b.length; i++){
                a[i] = a[i] + b[i];
            }
            System.out.println("Sum of two arrays "+Arrays.toString(a));
        }
    }
}
