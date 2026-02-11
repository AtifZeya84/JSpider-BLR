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
        h.add(60);
        h.add(70);
        System.out.println(h.size());
        System.out.println("-----------");
        h.display();
        System.out.println("-----------");
        h.remove(30);
        h.remove(10);
        h.remove(70);
        h.display();
        System.out.println(h.contains(20));
        System.out.println(h.contains(70));
    }
}

