package com.recursion;

public class Hcf {
    static int lcm(int a, int b, int current) {
    if (current==1)  return 1;
        if (current % a == 0 && current % b == 0) {
            return current;
        }

        return lcm(a, b, current - 1);   // recursive call
    }

    public static void main(String[] args) {

        int a = 10, b = 15;

        int start = (a > b) ? b : a;     // start checking from max value

        System.out.println("LCM = " + lcm(a, b, start));
    }
}
