package com.Arrays._2DArray;

import java.util.Arrays;

public class DigonalSum {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        System.out.println("  Given Array Is");
        for (int n[] : a){
            System.out.println("    " + Arrays.toString(n));
        }

        System.out.println("Sum of Diagonal using two loops"+twoLoop(a));
        System.out.println("Sum of Diagonal using one loops"+oneLoop(a));

    }

    public static int twoLoop(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
               if (i == j || i + j == a.length-1)   sum = sum + a[i][j];
            }
        }
        return sum;
    }

    public static int oneLoop(int[][] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i][i];
            if (i != a.length-1-i)
            sum += a[i][a.length-1-i];
        }
        return sum;
    }
}
