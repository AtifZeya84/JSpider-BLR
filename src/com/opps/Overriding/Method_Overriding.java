package com.opps.Overriding;

public class Method_Overriding {
    public static void main(String[] args) {
        int n = 12345;
        int c =0;
        System.out.println(count(n,c));
    }

    static int count(int n,int c){
        if (n==0) return c;
        c++;
        return count(n/10,c);
    }
}

