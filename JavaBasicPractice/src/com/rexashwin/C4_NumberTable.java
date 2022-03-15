package com.rexashwin;

import java.util.Scanner;

public class C4_NumberTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to make its table: ");
        int num = in.nextInt();
        for(int i=1; i<11; i++)
            System.out.println(num + " * " + i + " = " + num*i);
    }
}
