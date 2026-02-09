package com.Arrays._1DArray;

import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,10};

        // Using For Loop
        for(int i = 0 ; i < a.length ; i++){
            System.out.println(a[i]);
        }
        System.out.println("---------------");

        // Using For Each Loop
        for (int n : a){
            System.out.println(n);
        }
        System.out.println("---------------");

        // Using toString
        System.out.println(Arrays.toString(a));

        System.out.println("---------------");

        // Reverse array print
        for (int i = a.length - 1; i >= 0; i--){
            System.out.println(a[i]);
        }
    }
}
