package com.loops.Pattern;

public class dia2 {
    public static void main(String[] args) {
        int n=5;
        int st =1;
        int sp=n-1;
        for (int i=1;i<=2*n-1;i++){
            for (int j=1;j<=sp;j++){
                System.out.print("  ");
            }
            int num = 1;
            for (int j=1;j<=st;j++){
                System.out.print(num  +" ");
              if (j <= st/2) num++;
              else num--;
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
