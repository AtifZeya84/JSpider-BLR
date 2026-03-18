package com.DSA.Stack;

import com.DSA.ArrayList.StackUsingArrayList;

public class UserProgram {
    public static void main(String[] args) {
        StackUsingArrayList s = new StackUsingArrayList();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);


        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());

    }
}
