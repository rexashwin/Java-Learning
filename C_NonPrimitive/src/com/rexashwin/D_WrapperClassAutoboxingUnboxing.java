package com.rexashwin;

public class D_WrapperClassAutoboxingUnboxing {
    public static void main(String[] args) {
        int x1 = 10;
        Integer x2 = x1;
        int x3 = x2;
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);

//        this shows wrapper classes are reference variable
        Integer a1 = 400, a2 = 400;
        if (a1==a2)
            System.out.println("Same");
        else
            System.out.println("Not Same");
    }
}
