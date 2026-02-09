package com.opps.constructor;

public class Constructor {
    public static void main(String[] args) {
        Bike b1=new Bike("Yamaha");
        Bike b2 = new Bike("Ninja");

        b1.diaplay();
        b2.diaplay();
    }
}

class Bike{
    int regno;
    String name;
    private static int count = 1111;
    Bike(String name){
        this.name=name;
        regno=count;
        count++;
    }

    void  diaplay(){
        System.out.println("Name of bike is " + name);
        System.out.println("Reg no of bike is " + regno);
        ;
    }
}
