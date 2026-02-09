package com.string;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("malam"));
    }


    static boolean isPalindrome(String s) {
        char[] a = s.toCharArray();
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            if (a[i] != a[j]) return false;
            i++;
            j--;
        }
        return true;

    }
}

