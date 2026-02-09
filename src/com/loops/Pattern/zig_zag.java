package com.loops.Pattern;

public class zig_zag {
    public static void main(String[] args) {


        int n = 5;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                int a = ((i - 1) * n) + 1;
                for (int j = 1; j <= n; j++) {
                    System.out.print(a + "\t");
                    a++;
                }
            }
                else{
                    int a = i*n;
                    for (int j = 1; j <= n; j++) {
                        System.out.print(a + "\t");
                        a--;
                    }
                }
            System.out.println();
            }
        }
    }
