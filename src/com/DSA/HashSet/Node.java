package com.DSA.HashSet;

public class Node {
    Object ele;
    Node next;
    Node prev;

    Node(Object ele) {
        this.ele = ele;
    }

    public Node(Object ele, Node next, Node prev) {
        this.ele = ele;
        this.next = next;
        this.prev = prev;
    }
}