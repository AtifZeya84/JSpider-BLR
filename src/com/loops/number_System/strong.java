package com.loops.number_System;

public class strong {
    public static void main(String[] args) {
        int n = 144;
        int temp = n , sum = 0 ;

        while (n>0){
            int d = n%10;
            int fact = 1;
            for (int i = 1; i <= d ; i++){
                fact = fact * i;
            }
            sum = sum + fact;
            n = n/10;
        }
        if (sum == temp)
            System.out.println("Armstrong");
        else
            System.out.println("Not an Armstrong");
    }
}
