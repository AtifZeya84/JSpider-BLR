package com.Arrays.ArrayPractice;

import java.util.Arrays;

public class Demo26 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 2, 4, 6, 8, 8};
        int k = 0;
        System.out.println("Input: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < k; j++) {
                if (arr[i] == arr[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag)   arr[k++] = arr[i];
        }
        System.out.print("Output: [");
        for (int i = 0; i < k; i++)
            System.out.print(arr[i] + " ");

        System.out.println("]");
    }
}
