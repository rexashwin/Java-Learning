package com.rexashwin;

//Take 3 numbers as input and print the largest number.

import java.util.Scanner;

public class E_LargestOfThree {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter three integer number : ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if(a>b && a>c)
            System.out.println(a);
        else if(b>a && b>c)
            System.out.println(b);
        else
            System.out.println(c);
    }
}
