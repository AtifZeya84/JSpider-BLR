package com.loops.number_System;

public class Perfect_no {
    public static void main(String[] args) {
        int n = 10 ,sum = 0;
        for (int i = 1; i <= n/2; i++){
            if (n%i==0)  sum = sum + i;
        }
        if (sum == n) System.out.println("Perfect no");
        else System.out.println("Not a Perfect no");
    }
}
