package com.Arrays.ArrayPractice;

import java.util.Arrays;

public class Demo28 {
    public static void main(String[] args) {
        int[] a = {23,55,57,93,1,564};
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++){
            int rev = 0;
            int num = a[i];
            while (num > 0){
                rev = rev * 10 + (num % 10);
                num = num / 10;
            }
            b[i] = rev;
        }
        System.out.println("Given Array is "+ Arrays.toString(a));
        System.out.println("rev array is " + Arrays.toString(b));
    }
}
