
package com.Arrays.ArrayPractice;
public class Demo26{
    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 2, 4 , 6, 8, 8};

        System.out.print("Output: { ");

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print( arr[i] + " ");
            }
        }

        System.out.println("}");
    }
}
