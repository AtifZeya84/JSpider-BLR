package com.DSA.LinkedList;

public class UserProgram {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.size();
        l.addIndex(5,0);
        l.addIndex(25,4);
        l.display();
        System.out.println("--------------------");
        l.remove(0);
        l.remove(3);
        l.display();
    }
}
