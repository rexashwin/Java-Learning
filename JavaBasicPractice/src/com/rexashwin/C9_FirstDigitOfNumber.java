package com.rexashwin;

import java.util.Scanner;

public class C9_FirstDigitOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(firstDigit(num));
        System.out.println(firstDigitEfficientCode(num));
    }

    public static int firstDigitEfficientCode(int num) {
        double power = Math.log10(num);
        int p = (int)power;
        int ans = (int) Math.pow(10, p);
        return num/ans;
    }

    public static int firstDigit(int num) {
        while(num>10)
            num /= 10;
        return(num);
    }
}
