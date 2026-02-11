package com.Arrays.ArrayPractice;

import java.util.Arrays;

public class Demo27 {
    public static void main(String[] args) {
        int[] a = {1,6,4,2,1,2,9,5,3};
        int[] b = new int[a.length];
        int k = 0;
        System.out.println("Given Array is " + Arrays.toString(a));
        System.out.print("Array Without Element Present More Than Once are  { " );

        for (int i = 0; i < a.length; i++){
            int count = 1;
            if (a[i] == -1)  continue;
            for (int j = i + 1; j < a.length; j++){
                if (a[i] == a[j]){
                    count++;
                    a[j] = -1;
                }
            }
            if (count == 1)  b[k++] = a[i];
        }

        for (int i = 0; i < k; i++) {
            System.out.print(  + b[i] + " " );
        }
        System.out.print("}");
    }
}
