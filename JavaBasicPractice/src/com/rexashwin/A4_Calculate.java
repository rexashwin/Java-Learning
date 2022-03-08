package com.rexashwin;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class A4_Calculate {
    public static void main(String[] args) {
        int num1, num2, ans;
        char operator;
        Scanner in = new Scanner(System.in);
        System.out.print("enter num1 : ");
        num1 = in.nextInt();
        System.out.print("enter num1 : ");
        num2 = in.nextInt();
        System.out.print("enter operator : ");
        operator = in.next().charAt(0);
        if(operator=='+')
            System.out.println(num1 + num2);
        else if(operator=='-')
            System.out.println(num1 - num2);
        else if(operator=='*')
            System.out.println(num1 * num2);
        else if(operator=='/')
            System.out.println(num1 / num2);
        else if(operator=='%')
            System.out.println(num1 % num2);
        else
            System.out.println("invalid operator");


    }
}
