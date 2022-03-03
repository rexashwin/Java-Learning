package com.rexashwin;
//reverse a string


public class O_ReverseString {
    public static void main(String[] args) {
        String name = "bharat";
        int len = name.length();

//        String rev_name = "";
        StringBuilder rev_name = new StringBuilder();

        for (int i=len-1; i>=0; i--){
//            rev_name = rev_name + name.charAt(i);
            rev_name.append(name.charAt(i));
        }

        System.out.println(rev_name);
    }
}
