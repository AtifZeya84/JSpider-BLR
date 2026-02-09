package com.opps.Super;
class AAA{

    AAA(int i){
        System.out.println("A(int i) "+i);
    }
}
class BBB extends A{
    BBB(int i){
        super(1);
        System.out.println("B()");
    }

}
class CC extends B{

    CC(){
       super(10);
        System.out.println("C() ");
    }
}
public class DefaultSuper {

    public static void main(String[] args) {
        new CC();
    }
}
