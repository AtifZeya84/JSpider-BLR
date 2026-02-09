package com.Searching;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {2,5,4,6,8,1};
        int key = 5;
        System.out.println("Given Array = "+Arrays.toString(a));
        System.out.println("Index of " + key + " is " + find(a,key));
    }
    public static int find(int[] a, int key){
        for (int i = 0; i <= a.length; i++){
            if (a[i] == key) return i;
        }
        return -1;
    }
}
