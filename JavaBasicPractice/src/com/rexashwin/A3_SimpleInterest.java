package com.rexashwin;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class A3_SimpleInterest {
    public static void main(String[] args) {
        float principal, time, rate, simpleInterest;
        Scanner in = new Scanner(System.in);

//        take input for principal, rate, time;
        System.out.print("Enter principal : ");
        principal = in.nextFloat();
        System.out.print("Enter rate : ");
        rate = in.nextFloat();
        System.out.print("Enter time : ");
        time = in.nextFloat();

//        calculate and output si
        System.out.println("Interest will be : "+(principal*rate*time)/100);
    }
}
