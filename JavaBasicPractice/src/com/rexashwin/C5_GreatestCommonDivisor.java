package com.rexashwin;

import java.util.Scanner;

public class C5_GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int divisor = 1;
        for (int i=2; i<=Math.min(a,b); i++){
            if (a%i==0 && b%i==0)
                divisor = i;
        }
        System.out.println(divisor);
    }
}
