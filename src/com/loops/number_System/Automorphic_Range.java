package com.loops.number_System;

public class Automorphic_Range {
    public static void main(String[] args) {

        int a = 1;
        int b = 100;

        for (int n=a;n<=b;n++){
            boolean flag=true;
            int p=n*n;
            int temp=n;
            while (temp>0){
                if(temp%10!=p%10){
                    flag=false;
                    break;
                }
            temp/=10;p/=10;
            }
            if(flag)
                System.out.println(n);
        }

    }
}