package com.recursion;

public class PrimeNo {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(isPrime(n,n/2));
    }
    public static boolean isPrime(int n, int i){
        if (n<2) return false;
        if (i<2)  return true;
        if (n % i == 0 )   return false;
        return isPrime(n,i--);
    }
}
