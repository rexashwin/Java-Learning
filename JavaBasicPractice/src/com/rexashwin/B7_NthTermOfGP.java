package com.rexashwin;

import java.util.Scanner;

public class B7_NthTermOfGP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int r = in.nextInt();
        int n = in.nextInt();
        System.out.println(NthTerm(a,r,n));
    }

    private static int NthTerm(int a, int r, int n) {
        return (a*(int)(Math.pow(r, n-1)));
    }
}