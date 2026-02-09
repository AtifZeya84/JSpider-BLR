package com.string;

public class CountOfVowels {
    public static void main(String[] args) {
        String s = "JavaDeveloper".toLowerCase();
        String s1;
        int vowelcount = 0;
        int consonentcount = 0;
        while (s.length()>0){
            char c = s.charAt(0);
            s1 = s.replace(c+"","");
            int n = s.length() - s1.length();
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowelcount += n;
            }
            else{
               consonentcount += n;
            }
            s=s1;
        }
        System.out.println("No of Vowels = " + vowelcount);
        System.out.println("No of consent = " + consonentcount);
    }
}
