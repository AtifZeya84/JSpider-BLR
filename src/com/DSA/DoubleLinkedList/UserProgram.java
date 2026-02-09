package com.DSA.DoubleLinkedList;

public class UserProgram {
    public static void main(String[] args) {
        DoubleLinkedList l = new DoubleLinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.size();
        l.addIndex(5,0);
        l.addIndex(25,4);
        l.addIndex(55,7);
        l.display();

        System.out.println("--------------------");

        l.remove(0);
        l.remove(3);
        l.remove(5);
        l.display();
    }
}
