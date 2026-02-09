package com.opps.Downcasting;

class Animal{
    public void eat () {
        System.out.println("Animal-Eat");
    }
}

class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("Dog-Eats");
    }
    public void Bark(){
        System.out.println("Dog-Barks");
    }
}

class BabyDog extends Dog{
    @Override
    public void eat(){
        System.out.println("Baby Dog-Eats");
    }
    @Override
    public void Bark(){
        System.out.println("Baby Dog-Barks");
    }
    public void weep(){
        System.out.println("Weeping");
    }
}

class Cat extends Animal{@Override
    public void eat(){
    System.out.println("Cat-Eats");
    }
}
public class Ex_1 {
    public static void main(String[] args) {
        Animal a=new Dog();
        a.eat();
        Dog d=(Dog) a;
        d.eat();
        d.Bark();
        //  BabyDog b =(BabyDog) a;
        Animal a1=new BabyDog();
        a1.eat();
        Dog d1=(Dog) a1;
        d1.eat();
        d1.Bark();
        //  d1.weep;
        BabyDog b1=(BabyDog) d1;
        BabyDog b2=(BabyDog) a1;
        b1.eat();
        b1.Bark();
        b1.weep();

    }
}
