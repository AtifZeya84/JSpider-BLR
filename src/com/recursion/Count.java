package com.recursion;

public class Count {

    public static void main(String[] args) {
        int n = 1265345;
        int c = 0;
        System.out.println(count(n, c));
        System.out.println(count(789));
    }

    static int count(int n, int c) {
        if (n == 0) return c;
        c++;
        return count(n / 10, c);
    }
    static int count(int n) {
        if (n == 0) return 0;
        return 1 + count(n/10);
    }
}


