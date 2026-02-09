package com.loops.number_System;

public class BinToDec {
    public static void main(String[] args) {


        int n = 11101;
        int dec = 0;
        int i=0;
        while (n > 0) {
            int d = n%10;
            dec = dec + d * (int)Math.pow(2,i);
            i++;
            n=n/10;
        }
        System.out.println(dec);
    }
}