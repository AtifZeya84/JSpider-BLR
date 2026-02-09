package com.string;

public class RearrangeCharcter {
    public static void main(String[] args) {
        String s1="ram#123",s2="123#ram";
        System.out.println(checkChar(s1,s2));
    }
    public static boolean checkChar(String s1,String s2){
        String num="";
        String sc="";
        String alpha="";
        String FinalString="";
        
        for(char c:s1.toCharArray()){
            if(c>='0' && c<='9') num+=c;

            else if ((c>='A' && c<='Z')||(c>='a' && c<='z')) {
                alpha+=c;
            }
            else{
                sc+=c;
            }
        }
        FinalString=num+sc+alpha;
        System.out.println(FinalString);
        if(FinalString==s2) return true;
        else return false;
    }
    
}
