package com.Sorting;

import java.util.Arrays;

public class _2_InsertionSort {
    public static void main(String[] args) {
        int[] a = {6,2,9,1,7,7};
        System.out.println("Given Array = " + Arrays.toString(a));
        sort(a);
        System.out.println("Sorted Array by InsertionSort = " + Arrays.toString(a));;
    }

    public static void sort(int [] a){
        for (int  i = 1; i < a.length; i++){
            int j = i-1;
            int key = a[i];
            while (j >= 0 && a[j] > key){
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }
}
