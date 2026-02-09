package com.Sorting;

import java.util.Arrays;

public class _1_BubbleSort {
    public static void main(String[] args) {
        int[] a = {6,4,2,8,7,7};
        System.out.println("Given Array = " + Arrays.toString(a));
        sort(a);
        System.out.println("Sorted Array by BubbleSort = " + Arrays.toString(a));;
    }

    public static void sort(int[] a){
        for (int i = 0;i < a.length; i++){
            for (int j = 0;j < a.length - 1 - i; j++){
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                }
            }
        }
    }
}
