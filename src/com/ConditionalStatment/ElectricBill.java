package com.ConditionalStatment;

public class ElectricBill {
    public static void main(String[] args) {
        int u=350;
        int rs=0;
        if (u<100){
            rs=1*u;
            System.out.println(rs);
        }
       else if (u<200){
            rs=5*(u-100)+100*1;
            System.out.println(rs);
        }
        else if (u<300){
            rs=10*(u-200)+100*1+5*100;
            System.out.println(rs);
        }
        else if (u>300){
            rs=20*(u-300)+100*10+100*5+100*1;
            System.out.println(rs);
        }
    }
}
