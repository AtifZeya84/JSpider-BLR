package com.Arrays.ArrayPractice;

public class Demo4 {
    public static void main(String[] args) {
        int[] a = {4,2,8,9,5,4,24,8,9};
        for (int n : a){
            if (n % 2 ==0){
                System.out.println("Even elements are " + n);
            }
        }
    }
}
