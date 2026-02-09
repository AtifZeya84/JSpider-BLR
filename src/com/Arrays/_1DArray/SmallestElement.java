package com.Arrays._1DArray;

public class SmallestElement {
    public static void main(String[] args) {
        int [] a = {5,10,2,7,3,10,9,8};
        int min = a[0];
        for (int n : a){
            if (n < min)  min = n;
        }
        System.out.println("Smallest elements is " + min);
    }
}
