package com.Arrays.ArrayPractice;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        char[] ch = {'a','b','c','d','e','f'};
        char[] a = new char[ch.length];
        int j = 0;
        System.out.println("Given characters are " + Arrays.toString(ch));
        for (int i = ch.length - 1; i >= 0; i--){
            a[j] += ch[i]; j++;
        }
        System.out.println("Reversed Charactes are " + Arrays.toString(a));
    }
}
