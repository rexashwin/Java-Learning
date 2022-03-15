package com.rexashwin;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class C2_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Select an operation by entering the serial no.: \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        int selection = in.nextInt();
        System.out.println("Enter two number: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        switch (selection) {
            case 1 -> System.out.println(num1 + num2);
            case 2 -> System.out.println(num1 - num2);
            case 3 -> System.out.println(num1 * num2);
            case 4 -> System.out.println(num1 / num2);
            default -> System.out.println("Enter valid operation!");
        }
    }
}
