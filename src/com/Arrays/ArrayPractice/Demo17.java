package com.Arrays.ArrayPractice;

import java.util.Arrays;

public class Demo17 {
    public static void main(String[] args) {
        int[] a = {1,5,2,8,2,9,2,6,4,2};
        int maxcount = a[0];
        int maxele = 0;
        for (int i = 0; i < a.length; i++){
            int count = 0;
            for (int j = 0; j < a.length; j++){
                if (a[i] == a[j])  count++;
                }
            if (maxcount < count){
                maxcount = count;
                maxele = a[i];
            }
            }
        System.out.println("Given Array is "+ Arrays.toString(a));
        System.out.println("Max Element is " + maxele);
        System.out.println("Max count is " + maxcount);
        }
    }

