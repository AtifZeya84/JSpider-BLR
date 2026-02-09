package com.Sorting;

import java.util.Arrays;

public class _3_SelectionSort {
    public static void main(String[] args) {
        int[] a = {5, 6, 1, 4, 8, 2, 3, 0, 11};
        System.out.println("Given Array is " + Arrays.toString(a));
        sort(a);
        System.out.println("Sorted Array By SelectionSort " + Arrays.toString(a));
    }

    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[index]) index = j;
            }
            int temp = a[i];
            a[i] = a[index];
            a[index] = temp;

        }
    }
}
