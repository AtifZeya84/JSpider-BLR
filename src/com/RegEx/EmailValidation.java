package com.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {

        String s = "atifzeya123@gmail.com";
        String exp = "[a-z][a-z 0-9]@[g m]ail.com";
        Pattern p = Pattern.compile(exp);
        Matcher m =p.matcher(s);

        if(m.matches()) System.out.println("Valid Mail");
        else            System.out.println("Invalid Mail");
    }
}
