package com.rexashwin;

import java.util.Scanner;

public class B9_PositiveNegativeOddEvenZero {
    public static void PositiveNegativeZero(int n){
        if (n>0) {
            System.out.println("Positive");
            OddEven(n);
        }
        else if (n<0){
            System.out.println("Negative");
            OddEven(n);
        }
        else
            System.out.println("Zero");
    }
    public static void OddEven(int n){
        if (n%2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a no to find its positive or negative, odd or even, or zero: ");
        int n = in.nextInt();
        PositiveNegativeZero(n);
    }
}
