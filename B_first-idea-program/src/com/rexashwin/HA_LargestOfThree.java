package com.rexashwin;

import java.util.Scanner;

public class H_LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Q: Find the largest of the 3 numbers

//        //    approach 1
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }

//        //    approach 2
//        int max = 0;
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
//
//        if (c > max) {
//            max = c;
//        }

//        //    approach 3
        int max = Math.max(c, Math.max(a, b));

        System.out.println(max);
    }
}