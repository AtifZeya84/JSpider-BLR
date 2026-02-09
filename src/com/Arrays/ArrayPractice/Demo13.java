package com.Arrays.ArrayPractice;

public class Demo13 {
    public static void main(String[] args) {
        int[] a = {1,0,3,0,5,6,0};
        int count = 0;
        for (int n : a){
            if (n == 0)  count++;
        }
        System.out.println("Count Of Zeros = " + count);
    }
}
