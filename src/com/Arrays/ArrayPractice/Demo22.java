package com.Arrays.ArrayPractice;

import java.util.Arrays;

public class Demo22 {
    public static void main(String[] args) {
        int[] a = {5,9,1,2,8,11,5,4};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int n : a){
            if (n == max1)  continue;
            if (max1 < n){
                max2 = max1;
                max1 = n;
            }
            else if (n > max2)  max2 = n;
        }
        System.out.println("Given Array is "+ Arrays.toString(a));
        System.out.println("Max Ele is " + max1);
        System.out.println("2nd Max Ele is " + max2);
    }
}
