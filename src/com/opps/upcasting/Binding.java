package com.opps.upcasting;
import java.util.Scanner;
class Vehicle{
    public void start(){
    }
    public void accelerat(){
    }
    public void stop(){
    }
}

class Benz extends Vehicle{
    @Override
    public void start(){
        System.out.println("Benz starts");
    }
    @Override
    public void accelerat(){
        System.out.println("Benz moving");
    }
    @Override
    public void stop(){
        System.out.println("Benz stops");
    }
}
class Audi extends Vehicle{
    @Override
    public void start(){
        System.out.println("Audi starts");
    }
    @Override
    public void accelerat(){
        System.out.println("Audi moving");
    }
    @Override
    public void stop(){
        System.out.println("Audi stops");
    }
}
class Bmw extends Vehicle{
    @Override
    public void start(){
        System.out.println("Bmw starts");
    }
    @Override
    public void accelerat(){
        System.out.println("Bmw moving");
    }
    @Override
    public void stop(){
        System.out.println("Bmw stops");
    }
}
public class Binding {
    public static void drive(Vehicle v) {
        v.start();
        v.accelerat();
        v.stop();
    }

    public static Vehicle getCar() {
        Scanner s = new Scanner(System.in);
        System.out.println("1.Bmw /n 2.Benz /n 3.Audi /n 4.Invalid input");
        int n = s.nextInt();
        if (n == 1) return new Bmw();
        else if (n == 2) return new Benz();
        else if (n == 3) return new Audi();
        else   return null;
    }

    public static void main(String[] args) {
        drive(getCar());
    }

}
