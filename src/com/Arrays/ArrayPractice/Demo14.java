package com.Arrays.ArrayPractice;
import java.util.Arrays;
import java.util.Scanner;
public class Demo14 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the length of Array  ");
        int n = scr.nextInt();
        int[] a = new int[n];
        int b = 0;
        for (int i = 0; i < a.length; i++){
            System.out.println("Enter The Even Elements");
            int ele = scr.nextInt();
            if (ele % 2 ==0) { a[b] = ele; b++ ; }
        }
        System.out.println(Arrays.toString(a));
    }
}