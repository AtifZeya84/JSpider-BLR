package com.loops.number_System;
import java.util.Scanner;

public class Second_Largest_Primeno {
    public static void main(String[] args) {
        Scanner scr =new Scanner(System.in);
        System.out.println("Enrer starting point");
        int a = scr.nextInt();
        System.out.println("Enrer ending point");
        int b = scr.nextInt();
        int count=0;
        for (int i=b;i>=a;i--){
            boolean flag = true;
                for (int j=2;j<=i/2;j++){
                    if (i%j==0){
                        flag=false;
                        break;
                    }
                }
                if (flag  && i>=2){
                    count++;}
                if (count==2){
                    System.out.println(i);
                    break;}
            }
        }
    }


