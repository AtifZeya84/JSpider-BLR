package com.ConditionalStatment;

public class GreatestIn3 {
    public static void main(String[] args) {
        int a=143,b=74,c=69;
        if (a>b){
            if (a>c)
                System.out.println("the greatest no is  "+a);
            else
                System.out.println("the greatest no is  "+c);
        }
        else{
            if(b>c)
                System.out.println("the greatest no is  "+b);
            else
                System.out.println("the greatest no is  "+c);
        }

    }
}
