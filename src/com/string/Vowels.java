package com.string;

public class Vowels {
    public static void main(String[] args) {
        String s = "Atif Zeya";
        int count = 0;
        char[] c = s.toLowerCase().toCharArray();
        for(int i = 0 ; i < c.length ; i++){
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u'){
                count ++;
            }
        }
        System.out.println(count);
    }
}
