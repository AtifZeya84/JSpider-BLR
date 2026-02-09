package com.opps.Downcasting;

public class InstanceOf {
    public static void main(String[] args) {
        Animal a = new Dog();
        System.out.println(a instanceof Animal);        //t
        System.out.println(a instanceof Dog);           //t
        System.out.println(a instanceof BabyDog);       //f
        System.out.println(a instanceof Cat);           //f

        a = new BabyDog();
        System.out.println(a instanceof Animal);        //
        System.out.println(a instanceof Dog);
        System.out.println(a instanceof BabyDog);
        System.out.println(a instanceof Cat);

        a = new Cat();
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Dog);
        System.out.println(a instanceof BabyDog);
        System.out.println(a instanceof Cat);
    }
}
