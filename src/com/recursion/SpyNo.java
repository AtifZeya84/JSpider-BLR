package com.recursion;

public class SpyNo {
    public static void main(String[] args) {
        int n = 127;
        int m=1,s=0;
        System.out.println(spy(n,m,s));
    }

    static boolean spy(int n,int m,int s){
        if (n==0)  return m==s;
        m = m * ( n % 10);
        s = s + ( n % 10);
        return spy(n/10,m,s);
    }
}
