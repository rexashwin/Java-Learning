package com.rexashwin;

import java.util.Scanner;

public class K_CountOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num, n, count = 0;
        System.out.println("Enter a number: ");
        num = input.nextLong();
        System.out.println("Enter the occurred: ");
        n = input.nextInt();
        while (num>0){
            long temp = num % 10;
            if ( temp == n)
                count++;
            num /= 10;
        }
        System.out.println(n + " occurred " + count + " times");
    }
}
