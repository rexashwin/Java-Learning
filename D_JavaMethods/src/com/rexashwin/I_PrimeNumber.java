package com.rexashwin;

import java.util.Scanner;

public class I_PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println("Prime? - " + isPrime(n));

        System.out.println("Armstrong? - " + isArmstrong(n));

//        print all the three digit armstrong number\
        System.out.print("all three digit armstrong numbers are:\t");
        for (int i=100; i<=1000; i++){
            if (isArmstrong(i)){
                System.out.print(i + ",\t");
            }
        }
    }

    private static boolean isArmstrong(int n) {
        int rem, cube, sum = 0, original = n;
        while (original > 0){
            rem = original % 10;
            cube = rem * rem * rem;
            sum += cube;
            original /= 10;
        }
        return sum == n;
    }

    static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if (n % c == 0)
                return false;
            c++;
        }
        return true;
//        if (c * c > n)
//            return true;
//        return false;

        // simplified last if statement
//        return c * c > n;
    }


}
