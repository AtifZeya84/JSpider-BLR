package com.loops.number_System;

public class Armstrong {

        public static void main(String[] args) {
            int n = 53;
            int temp = n;
            int sum = 0;

            int len = (n + "").length();

            while (n > 0) {
                int d = n % 10;

                int pow = (int) Math.pow(d, len);
                sum += pow;

                n = n / 10;
            }

            if (sum == temp)
                System.out.println("Armstrong");
            else
                System.out.println("Not Armstrong no");
        }
    }
