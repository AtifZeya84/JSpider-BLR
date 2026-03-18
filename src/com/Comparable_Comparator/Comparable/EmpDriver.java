package com.Comparable;

import java.util.Arrays;

public class EmpDriver {
    public static void main(String[] args) {
        Emp e1 = new Emp(1,29,"zam");
        Emp e2 = new Emp(3,19,"zaj");
        Emp e3 = new Emp(4,39,"kashish");
        Emp e4 = new Emp(2,25,"Gaurav");

        Emp[] e = {e1,e2,e3,e4};
        Arrays.sort(e);
        for (Emp emp:e) System.out.println(emp);
    }
}
