package com.loops.number_System;
import java.util.Scanner;

public class Alternate_prime_no {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting range: ");
        int start = sc.nextInt();

        System.out.print("Enter ending range: ");
        int end = sc.nextInt();

        int primeCount = 0;

        for (int n = start; n <= end; n++) {

            if (n <= 1) continue;

            boolean isPrime = true;


            for (int i = 2; i < n/2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime == true) {
                primeCount++;
                if (primeCount % 2 == 1) {
                    System.out.print(n + " ");
                }
            }
        }
    }
}

