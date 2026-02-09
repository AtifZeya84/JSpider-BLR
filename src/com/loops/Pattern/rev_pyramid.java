package com.loops.Pattern;

public class rev_pyramid {
    public static void main(String[] args) {


        int n = 5;
        int st = 2 * n - 1;
        int sp = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1;j<=sp; j++){
                System.out.print("  ");
            }
            for (int j =1;j<=st;j++){
                if (j==1||j==st||i==1)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            sp++;
            st-=2;
            System.out.println();

        }

    }
}