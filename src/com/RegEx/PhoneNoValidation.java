package com.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNoValidation {
    public static void main(String[] args) {

        String s = "789456130";
        String exp = "[6-9][0-9]{9}";
        Pattern p = Pattern.compile(exp);
        Matcher m =p.matcher(s);

        if(m.matches()) System.out.println("Valid Phone No");
        else            System.out.println("Invalid Phone no");
    }
}
