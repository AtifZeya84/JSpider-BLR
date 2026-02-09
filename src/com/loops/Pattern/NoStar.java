package com.loops.Pattern;

public class NoStar {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1;i<=n;i++){
            int a =n;
            for (int j = n;j>=i;j--){
                if (j<=i)
                    System.out.print(j);
                else
                System.out.print(j+ "*");
            }
            System.out.println();
        }
    }
}
