package com.Arrays._2DArray;

public class Demo1 {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        a[0][0] = 10;
        a[0][1] = 9;
        a[1][0] = 8;
        a[1][1] = 7;

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
