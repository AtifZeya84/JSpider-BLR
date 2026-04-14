package Practice.Array;

public class Maximum {
    static void main() {
        int[] a = {8,6,5,11,9};
        int max = a[0];
        for (int n : a){
            if (n > max) max = n;
        }
        System.out.println(max);
    }
}
