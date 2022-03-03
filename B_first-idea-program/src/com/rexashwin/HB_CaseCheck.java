package com.rexashwin;

import java.util.Scanner;

public class HB_CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letter = input.next().trim().charAt(0);

        if (letter >= 'a' && letter <= 'z'){
            System.out.println("Lowercase");
        }
        else
            System.out.println("uppercase");

        System.out.println(letter);
    }
}
