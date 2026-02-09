package com.recursion;

public class Automorphic {
    public static void main(String[] args) {

        int n = 5;
        int sq = n * n;
        System.out.println(Automorphic(n,sq));
    }

    static boolean Automorphic(int n , int sq){
        if (n==0)  return true;
        if (n%10 != sq%10) return false;
        return Automorphic(n/10,sq/10);
    }
}