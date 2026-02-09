package com.Arrays.ArrayPractice;

import java.util.Arrays;

public class Demo25 {
    public static void main(String[] args) {
        int[] a = {23,55,57,93,10,1};
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++){
            int num = a[i];
            while (num > 9) {
                int sum = 0;
                while (num > 0) {
                    sum = sum + (num % 10);
                    num = num / 10;
                }
                num = sum;
            }
            b[i] = num;
        }
        System.out.println("Given Array is "+ Arrays.toString(a));
        System.out.println("o/p array is " + Arrays.toString(b));
    }
}
