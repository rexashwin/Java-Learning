package com.rexashwin;

import java.util.Scanner;

public class D0_primeFactors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a integer to find its prime factors: ");
        int num = in.nextInt();
        primeFactors(num);

    }

    public static boolean isPrime(int n){
        if (n==1) return false;
        if (n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for (int i=5; i*i<=n; i+=6)
            if (n%i==0 || n%(i+2)==0) return false;
        return true;
    }

    public static void primeFactors(int n){
        for (int i=2; i<n; i++) {
            if (isPrime(i)) {
                int k = i;
                while (n % k == 0) {
                    System.out.println(i);
                    k *= i;
                }
            }
        }
    }
}
