package com.Arrays.ArrayPractice;

public class Demo12 {
    public static void main(String[] args) {
        char[] ch = {'a','b','c','d','e','f'};
        for (char n : ch){
            if (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u'){
                System.out.println(" Vowels are " + n);
            }
        }
    }
}
