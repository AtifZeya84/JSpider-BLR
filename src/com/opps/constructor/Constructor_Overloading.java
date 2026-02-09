package com.opps.constructor;

public class Constructor_Overloading {
    public static void main(String[] args) {
        Box b1 = new Box(3,5,6);
        Box b2 = new Box(5);
        b1.display();
        b2.display();
    }
}

class Box{
    int height,width,length;
    Box (int height,int width,int length){
        this.height=height;
        this.width=width;
        this.length=length;
    }

    Box (int d){
       length=d;
       width=d;
       height=d;
    }
    void display(){
        System.out.println("Height = " + height + " " +"width = " + width +" " + "Length = " + length);
    }
}
