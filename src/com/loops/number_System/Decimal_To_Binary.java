package com.loops.number_System;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        int n = 23;
        int binary = 0;
        int place = 1;   // 1, 10, 100, 1000...

        while (n > 0) {
            int d = n % 2;        // remainder
            binary = binary + (d * place);
            place = place * 10;   // move to next binary place
            n = n / 2;
        }

        System.out.println(binary);
    }
}






