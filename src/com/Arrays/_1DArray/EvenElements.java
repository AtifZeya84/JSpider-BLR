package com.Arrays._1DArray;

public class EvenElements {
    public static void main(String[] args) {
        int[]a={2,5,6,8,9};
        for (int n : a){
            if(n % 2 == 0) System.out.println("Even Elements = " + n);
        }
    }
}
