package com.opps.Abstraction;

public class AbstractKeyword {
    abstract class A {
      abstract public void m1() ;
      abstract public void m2();
    }

    abstract class B extends A{
        @Override
        public void m1(){
            System.out.println("m1()-B");
        }
    }
    class C extends B{
        @Override
        public void m2(){
            System.out.println("m2()-C");
        }
    }

    public class demo{
        public static void main(String[] args) {

        }
    }
}