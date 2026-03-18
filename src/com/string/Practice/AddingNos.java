package com.string;

public class AddingNos {
    public static void main(String[] args) {
        String s = "a12b3b5";
        char[] a=s.toCharArray();
        int sum =0;
        for (int i =1;i< a.length;i++){
            if (a[i]>='0'&&a[i]<='9'){
                sum=sum+(a[i]-'0');
            }
        }
        System.out.println(sum);
    }
}
