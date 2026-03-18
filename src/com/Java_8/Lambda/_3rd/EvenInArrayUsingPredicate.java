package com.Java_8.Functional_Interface;

import java.util.function.Predicate;

public class EvenInArrayUsingPredicate {
    static void main() {
//        int[] arr = {2, 5, 9, 6, 8, 3, 4};
//        //Even
//        for (int num : arr) {
//            Predicate<Integer> pr = n -> n % 2 == 0;
//            System.out.println(pr.test(arr[num]));
//        }
//        //Odd
//        for (int num : arr) {
//            Predicate<Integer> pr1 = n -> n % 2 != 0;
//            System.out.println(pr1.test(arr[num]));
//        }
        //Pallindrome
        Predicate<Integer> pr2 = n -> {
            int rev = 0;
            int temp = n;
            while (temp % 10 != 0) {
                rev = rev * 10 + (temp % 10);
                temp = temp / 10;
            }
            return n == rev;
        };
        System.out.println(pr2.test(123));
    }
}
