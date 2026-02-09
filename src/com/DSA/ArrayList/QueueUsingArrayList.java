package com.DSA.ArrayList;

public class QueueUsingArrayList {
    Object[] o = new Object[10];
    int count = 0;

    public void increase() {
        Object[] a = new Object[o.length + 5];
        for (int i = 0; i < o.length; i++) {
            a[i] = o[i];
        }
        o = a;
    }


    public void add (Object ele) {
        if (count >= o.length) {
            increase();
        }
        o[count++] = ele;
    }


    public Object poll() {
        Object front = o[0];
        for (int i = 0; i < count - 1; i++) {
            o[i] = o[i + 1];
        }
        o[count - 1] = null;
        count--;
        return front;
    }


    public Object peek() {
        return o[0];
    }


    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }


    public static void main(String[] args) {
        QueueUsingArrayList q = new QueueUsingArrayList();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println("----------------");

        while (!q.isEmpty()) System.out.println(q.poll());
        System.out.println("----------------");
        System.out.println(q.isEmpty());

    }
    }

