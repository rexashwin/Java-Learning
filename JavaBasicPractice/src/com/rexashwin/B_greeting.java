package com.rexashwin;

//take name as input and print a greeting message for that name.

import java.util.Scanner;

public class B_greeting {
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.println("Hello "+name);
    }
}
