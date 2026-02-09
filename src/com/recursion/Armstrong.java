package com.recursion;

public class Armstrong {

    public static void main(String[] args) {
        int n = 153;
        int len = (n + "").length();

        System.out.println(Arm(n,n,0,len));
    }
    static boolean Arm(int n , int temp, int sum, int len){
        if (n == 0) return temp == sum;
         sum = sum + (int)Math.pow(n%10,len);
         return Arm(n/10,temp,sum,len);


    }
}
