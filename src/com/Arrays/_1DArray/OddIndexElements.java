package com.Arrays._1DArray;

public class OddIndexElements {
    public static void main(String[] args) {
        int [] a = {8,5,7,6,5,5,4};
        for(int i = 0;i < a.length; i++){
            if (i % 2 != 0) System.out.println("Odd index elements are " +a[i]);
        }
    }
}
