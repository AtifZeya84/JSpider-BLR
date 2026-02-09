package com.Searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {2,5,4,6,8,1};
        int key = 5;
        System.out.println("Given Array = "+ Arrays.toString(a));
        System.out.println("Index of " + key + " is " + find(a,key));
    }
    public static int find(int[] a, int key){
        int st = 0;
        int end = a.length - 1;
        while (st <= end){
            int mid = (st + end) / 2;
            if( key == a[mid])  return mid;
            else if (key < a[mid])  end = mid - 1;
            else  st = mid + 1;
        }
        return -1;
    }
}
