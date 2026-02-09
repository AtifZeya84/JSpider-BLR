package com.opps.Super;
class A{
    A(){
        System.out.println("A()");
    }
    A(int i){
        this();
        System.out.println("A(int i) "+i);
    }
}
class B extends A{
    B(){
        this(30);
        System.out.println("B()");
    }
    B(int i){

        System.out.println("B(int i) "+i);
    }
}
class C extends B{
    C(){
        System.out.println("C()");
    }
    C(int i){
        this();
        System.out.println("C(int i) "+i);
    }
}
public class CallToSuper2 {
    public static void main(String[] args) {
        new C(30);
    }
}
