package com.DSA.Stack;

import java.util.EmptyStackException;

public class Stack {
  Node head;
    int count = 0;
    public void push(Object ele){
        Node n = new Node(ele);
        if (head == null){
            head = n;
            count++;
            return;
        }
        n.next = head;
        head = n;
        count++;
    }

    public int size(){
        return  count;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public Object peek(){
        return head.ele;
    }

    public Object push(){
        if (head == null)  throw new EmptyStackException();
        Object key = head.ele;
        head = head.next;
        count--;
        return key;
    }
}
