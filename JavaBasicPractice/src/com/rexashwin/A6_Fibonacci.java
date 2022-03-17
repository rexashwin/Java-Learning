package com.rexashwin;

//To calculate Fibonacci Series up to n numbers

import java.util.Scanner;

public class A6_Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1=1, n2=1, n3, count = in.nextInt();
        System.out.print(n1+"\t"+n2);
        for(int i=2; i<count; i++){
            n3 = n1 + n2;
            System.out.print("\t"+n3);
            n1=n2;
            n2=n3;
        }
    }
}
