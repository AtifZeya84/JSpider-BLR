package com.Arrays._2DArray;

import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int n = 5;
        int row = 0;
        int col = -1;
        char d = 'r';

        int[][] a = new int[n][n];
        for (int i = 1; i<= n*n; i++){
            switch (d) {
                case 'r' :{
                    col++;
                    a[row][col] = i;
                    if (col == a.length-1 || a[row][col + 1] != 0)    d = 'd';
                }
                break;
                case 'd' :{
                    row++;
                    a[row][col] = i;
                    if (row == a.length-1 || a[row + 1][col] != 0)    d = 'l';
                }
                break;
                case 'l' :{
                    col--;
                    a[row][col] = i;
                    if (col == 0 || a[row][col + -1] != 0)    d = 'u';
                }
                break;
                case 'u' :{
                    row--;
                    a[row][col] = i;
                    if ( a[row - 1][col] != 0)    d = 'r';
                }
                break;
            }
        }
        for (int[] m : a){
            System.out.println(Arrays.toString(m));
        }
    }
}
