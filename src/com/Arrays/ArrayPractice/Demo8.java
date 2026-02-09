package com.Arrays.ArrayPractice;

public class Demo8 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int sum = 0;
        for (int n : a) {
            if (n % 2 == 0)   sum += n;
        }
        System.out.println("Sum of even Elements are " + sum);
    }
}
