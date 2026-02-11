package com.Arrays._1DArray;

public class HighestOccuranceElement {
    public static void main(String[] args) {
        int[] a = {1,5,6,8,6,1,4,6,5,6};
        int count1 = 0;
        for (int i = 0; i < a.length; i++){
            int count2 = 0;
            for (int j = 0; j < a.length; j++){
                if (a[i] == a[j])  count2++;
            }
            if (count2 > count1)  count1 = count2;
        }
        System.out.println(count1);
    }
}
