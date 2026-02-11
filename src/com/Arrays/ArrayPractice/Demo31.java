package com.Arrays.ArrayPractice;

import java.util.Arrays;

public class Demo31 {
    public static void main(String[] args) {
        int[] a = {1,11,3,4};
        int[] b ={5,6,7,16,9};
        int[] c = new int[a.length + b.length];
        int k = 0;
        int l = 0;
        for (int i = 0; i < c.length; i++){
            if (i < a.length){
                c[i] = a[k++];
            }
            else c[i] = b[l++];
        }
        System.out.println(Arrays.toString(c));
    }
}
