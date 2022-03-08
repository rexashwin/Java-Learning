package com.rexashwin;

public class B3_Factorial {
    public static void main(String[] args) {
        int num = 8, fac=1;
        for (int i=2;i<=num;i++)
            fac *= i;
        System.out.println(fac);
    }
}
