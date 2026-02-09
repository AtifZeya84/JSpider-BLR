package com.DSA.ArrayList;

public class StackUsingArrayList {

    ArrayList a = new ArrayList();
    public void push(Object ele){
        a.add(ele);
    }
    public Object peek(){
        return a.get(a.size()-1);
    }
    public Object pop(){
        Object key = a.get(a.size()-1);
        a.remove(a.size()-1);
        return key;
    }
    public int size(){
        return a.size();
    }
    public boolean isEmpty(){
        return a.isEmpty();
    }

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
