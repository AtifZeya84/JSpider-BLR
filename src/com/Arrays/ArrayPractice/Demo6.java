package com.Arrays.ArrayPractice;

public class Demo6 {
    public static void main(String[] args) {
        int [] a ={1,2};
        int sum = 0;
        for (int n : a){
            sum += n;
        }
        System.out.println("Sum of Given array = " + sum);
    }
}
