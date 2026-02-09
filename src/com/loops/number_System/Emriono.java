package com.loops.number_System;

public class Emriono {
    public static void main(String[] args) {
        int n = 13;
        if (isEmrip(n))
            System.out.println("Emrip no");
        else
            System.out.println("Not an Emrip no");

    }


    static boolean isEmrip(int n) {
        int p = 0;
        boolean flag = true;
        if (isPrime(n)) {
            while (n > 0) {
                int d = n % 10;
                p = p * 10 + d;
                n = n / 10;
            }
            if (!(isPrime(p)))  flag = false;

        }
        return flag;
    }

    static boolean isPrime(int n) {
        boolean flag = true;
        if (n <= 1) flag = false;
        else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) flag = false;
            }
        }

        return flag;
    }
}

