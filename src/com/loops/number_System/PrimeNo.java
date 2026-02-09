package com.loops.number_System;

public class PrimeNo {
    public static void main(String[] args) {
        int n = 6;
        boolean flag = true;
        for (int i = 2; i <= n/2; i++){
            if (n % i == 0){
                flag = false;
                break;
            }
        }
        if (flag && n >= 2) System.out.println("Prime no");
        else System.out.println(" not a prime no");
    }
}
