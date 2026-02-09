package com.recursion;

public class Prime_Palindrome {
public static void main(String[] args) {
    int n =131;int temp=n; int rev=0;
    if(pallin(n,rev,temp) && prime(n,n/2))
        System.out.println("true");
    else
        System.out.println("false");
}


    static boolean pallin(int n, int rev ,int temp){
        if (n==0)  return temp==rev;
        rev = rev*10 + (n%10);
        return pallin(n/10,rev,temp);
    }

    static boolean prime(int n,int i){
    if (i<2)   return true;
    if (n<2 || n%i==0 )  return false;
    return prime(n,i-1);
    }

}
