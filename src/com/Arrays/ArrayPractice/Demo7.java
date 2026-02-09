package com.Arrays.ArrayPractice;

public class Demo7 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < a.length; i++){
            if (i % 2 == 0)  sum1 += a[i];
            else if (i%2 != 0)  sum2 += a[i];
        }
        System.out.println("Even index sum = " + sum1);
        System.out.println("Odd index sum = " + sum2);
    }
}
