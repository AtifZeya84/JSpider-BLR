package Practice.Basics_Setups;

/* Swap two numbers without a third variable */

public class Swap1 {
    static void main() {
        int a = 10;
        int b = 20;
        System.out.println("Before swap "+a);
        System.out.println("Before swap "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap "+a);
        System.out.println("After swap "+b);
        int x = 30;
        int y = 40;
        System.out.println("Before swap "+x);
        System.out.println("Before swap "+y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swap "+x);
        System.out.println("After swap "+y);

    }
}
