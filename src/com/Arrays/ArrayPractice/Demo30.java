package com.Arrays.ArrayPractice;

import java.util.Arrays;

public class Demo30 {
    public static void main(String[] args) {
        int[] a ={231,554,572,962,42,1};
        for (int i = 0; i <a.length; i++){
            int n = a[i];
            int sum = 0;
            while (n > 0){
                int d = n % 10;
                if (d % 2 == 0) sum += d;
                n /= 10;
            }
            a[i] = sum;
        }
        System.out.println(Arrays.toString(a));
    }
}
