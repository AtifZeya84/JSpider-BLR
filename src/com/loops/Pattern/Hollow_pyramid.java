package com.loops.Pattern;

public class Hollow_pyramid {
    public static void main(String[] args) {
        int n = 5;
        int st = 1;
        int sp = n-1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=sp;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=st; j++){
                if (j==1||j==st||i==n){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            st += 2;
            sp --;
            System.out.println();
        }
    }
}
