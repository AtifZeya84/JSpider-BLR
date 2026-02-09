package com.Arrays._1DArray;

public class BiggestElement {
    public static void main(String[] args) {
        int [] a = {5,10,2,7,1,10,9,8};
        int max = 0;
        for (int n : a){
            if(n>max)   max=n;
        }
        System.out.println("Max element is " + max);
    }
}
