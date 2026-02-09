package com.recursion;

public class Basics {
    public static void main(String[] args) {
        int n = 5;
        getNum(n);
    }
    public static void getNum(int n){
        if (n<=0) return;
        System.out.println(n);
        getNum(n-1);
        System.out.println(n);

    }
}
