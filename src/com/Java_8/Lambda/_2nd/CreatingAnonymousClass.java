package com.Java_8.Lambda._2nd;

public class Demo {
    static void main() {
        Thread tr = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am calling run");
            }
        });
        tr.start();
    }
}
