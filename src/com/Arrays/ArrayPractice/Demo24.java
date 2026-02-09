package com.Arrays.ArrayPractice;

import java.util.Arrays;

public class Demo24 {
    public static void main(String[] args) {
        int[] a = {0,2,-1,0,2,-1,3};
        System.out.println("i/p array " + Arrays.toString(a));
        for (int i = 0; i < a.length; i++){
            if (a[i] == 0)   a[i] = -1;
            else if ( a[i] == -1) a[i] = 0;
        }
        System.out.println("o/p array " + Arrays.toString(a));
    }
}
