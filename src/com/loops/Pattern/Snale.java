package com.loops.Pattern;

public class Snale {

        public static void main(String[] args) {

            int n = 6;
            int last = 0;

            for (int i = 1; i <= n; i++) {

                last = last + i;

                int num = last;
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + "\t");
                    num--;
                }

                System.out.println();
            }
        }
    }


