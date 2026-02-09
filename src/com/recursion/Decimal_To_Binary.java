package com.recursion;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        int n = 23;
        if(n == 0)
            System.out.println("0");
        else
            binary(n);
    }

    static void binary(int n){
        if (n == 0)  return;
        binary(n/2);
        System.out.print(n%2);
    }
}
