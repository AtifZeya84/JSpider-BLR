package com.loops.Pattern;

public class Rev_tringle {
    public static void main(String[] args) {
        int n = 5;
        for(int i = n ; i >= 1 ; i--){
            for(int j = n;j >= n-i+1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
