package com.loops.number_System;

public class Armstrong_range {
    public static void main(String[] args) {
        int a=1;int b=100;

        for (int n=a;n<=b;n++){
            int count=0;
            int temp=n;
            int sum=0;
            while (n>0){
                n=n/10;count++;
            }
            n=temp;
            while (n>0){
                int d = n%10;
                int p=1;
                for(int i=1;i<=count;i++){
                    p=p*d;
                }
                sum=sum+p;
            }
            if (temp==sum){
                System.out.println(n);
            }
        }
    }
}
