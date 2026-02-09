package com.Arrays.ArrayPractice;

import java.util.Arrays;

public class Demo15 {
    public static void main(String[] args) {
        int[] a = {1,2,9,3,9,4,9,6,9,8};
        System.out.println("Given Array is " + Arrays.toString(a));
        int ele = 9;
        for (int i = a.length-1; i >= 0; i--){
            if (a[i] == ele){
                System.out.println("Last Index Of " + ele + " is " + i);
                break;
            }
        }
    }
}
