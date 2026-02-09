package com.opps.Encapsulation.GetterAndSetter;

public class Facebook {
    private String id = "1234";
    private String pass = "absd";

    public String getId() {
        return id;
    }

    public String getPass() {
        return pass;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}

class User extends Facebook{
    public static void main(String[] args) {
        
    }

}