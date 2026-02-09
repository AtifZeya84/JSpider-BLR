package com.Sorting;

import java.util.Arrays;

public class _5_QuickSort {
    public static void main(String[] args) {
        int[] a = {3,2,4,9,8,0,9};
        System.out.println("Given Array is "+ Arrays.toString(a));
        sort(a, 0, a.length-1);
        System.out.println("Sourted Array By QuickSort  "+ Arrays.toString(a));
    }
    public static void sort(int[] a, int st, int end){
        if (st>end)    return;
        int i = st;
        int j = end;
        int pivot = (st + end)/2;
        while (a[i] < a[pivot])       i++;
        while (a[j] > a[pivot])       j--;
        if(i <= j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++; j--;
        }
        sort(a, st, j);
        sort(a, i, end);
    }
}
