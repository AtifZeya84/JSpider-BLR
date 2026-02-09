package com.loops.Pattern;

public class Diamond {
    public static void main(String[] args) {
        int n=5;
        int st =1;
        int sp=n-1;
        for (int i=1;i<=2*n-1;i++){
            for (int j=1;j<=sp;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=st;j++){
                if (j==1||j==st)
                System.out.print("* ");
                else {
                    System.out.print("  ");
                }
            }
            if(i<n){
                st+=2;
                sp--;
            }
            else {
                st-=2;
                sp++;
            }
            System.out.println();
        }
    }
}
