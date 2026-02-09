package com.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] a = {2,5,7,9};
        int[] b = {4,6,9};
        int[] c = new int [a.length + b.length];
        merge(a, b, c);
        System.out.println("1st Array"+Arrays.toString(a));
        System.out.println("2nd Array"+Arrays.toString(b));
        System.out.println("Sorted Array"+Arrays.toString(c));
    }
    public static void merge(int[] a,int[] b,int[] c){
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length){
            if (a[i] <  b[j])   c[k++] = a[i++];
            else                c[k++] = b[j++];
        }
        while (i < a.length )   c[k++] = a[i++];
        while (j < b.length )   c[k++] = b[j++];
    }
}
