package com.rexashwin;

import java.util.Scanner;

public class B8_LastDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = Math.abs(x);
        System.out.println(y%10);
    }
}
