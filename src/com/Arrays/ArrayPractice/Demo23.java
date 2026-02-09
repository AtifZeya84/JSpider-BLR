package com.Arrays.ArrayPractice;

import java.util.Arrays;

public class Demo23 {
    public static void main(String[] args) {
        int[] a = {5,9,3,4,3,1,17,1,9};
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++){
            if (a[i] == min1)  continue;
            if (min1 > a[i]){
                min2 = min1;
                min1 = a[i];
            }
            else if (min2 > a[i])   min2 = a[i];
        }
        System.out.println("Given Array is "+ Arrays.toString(a));
        System.out.println("Min Ele is " + min1);
        System.out.println("2nd Min Ele is " + min2);
    }
}
