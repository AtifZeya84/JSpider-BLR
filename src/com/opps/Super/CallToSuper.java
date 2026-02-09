package com.opps.Super;

class AA{
    {
        System.out.println("Non satic block 1 AA");
    }
    {
        System.out.println("Non satic block 2 AA");
    }
}
class BB extends AA{
    {
        System.out.println("Non satic block 1 BB ");
    }
    {
        System.out.println("Non satic block 2 BB");
    }
}
public class CallToSuper {
    public static void main(String[] args) {
        new BB();
    }
}
