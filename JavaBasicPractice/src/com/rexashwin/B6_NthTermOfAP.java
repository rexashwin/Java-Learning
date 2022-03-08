package com.rexashwin;

import java.util.Scanner;

public class B6_NthTermOfAP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int d = in.nextInt();
        int n = in.nextInt();
        System.out.println(NthTerm(a,d,n));
    }

    private static int NthTerm(int a, int d, int n) {
        return (a+((n-1)*d));
    }
}
