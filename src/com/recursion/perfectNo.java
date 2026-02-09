package com.recursion;

public class perfectNo {
    //    6  1+2+3 = 6
    public static void main(String[] args) {

        int n = 9;  int sum=0;
        System.out.println(perfect(n,n/2,sum));
    }

    static boolean perfect(int n ,int i,int sum){
        if (i<1)  return sum==n;
        if(n%i==0)
        sum = sum + i;
        return perfect(n,i-1,sum);
    }
}