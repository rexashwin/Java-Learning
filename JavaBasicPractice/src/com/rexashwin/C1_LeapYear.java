package com.rexashwin;

import java.util.Scanner;

public class C1_LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LeapYear(n);
    }
    public static void LeapYear(int n){
        if(n%4==0 && n%100!=0)
            System.out.println("Leap Year");
        else if (n%400==0)
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}
