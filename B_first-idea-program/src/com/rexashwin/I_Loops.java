package com.rexashwin;

import java.util.Scanner;

public class I_Loops {
    public static void main(String[] args) {

        /*
            Syntax of for loops:
            for (initialisation; condition; increment/decrement) {
                // body
            }
        */

        //  Q: Print numbers from 1 to 5
//        for (int num = 1; num <= 5; num += 2) {
//            System.out.println(num);
//        }

        //  print numbers from 1 to n
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        for (int num = 1; num <= n; num++) {
//            System.out.print(num + " ");
//        }

        /*
            Syntax of while loops:
            while (condition) {
                // body
                // increment/decrement
            }
         */
//        int num  = 1;
//        while (num <= 5) {
//            System.out.println(num);
//            num += 1;
//        }

        /*
            syntax of do while loop:
            do {
                // body
            } while (condition);
         */
        int n = 1;
        do {
            System.out.println("Hello World");
        } while (n != 1);

    }
}
