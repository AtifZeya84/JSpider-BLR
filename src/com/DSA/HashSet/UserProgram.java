package com.DSA.HashSet;

import com.DSA.DoubleLinkedList.DoubleLinkedList;

public class UserProgram {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
        h.add(50);
        System.out.println(h.size());
        System.out.println("-----------");
        h.display();

    }
}

