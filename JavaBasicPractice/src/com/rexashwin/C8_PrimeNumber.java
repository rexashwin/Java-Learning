package com.rexashwin;

import java.util.Scanner;

public class C8_PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(EfficientPrime(num))
            System.out.println("This is a prime number.");
        else
            System.out.println("Not a prime number.");
    }

//    naive method -- bigO(n)
    public static boolean isPrime(int n){
        if(n==1)
            return false;
        for(int i=2; i<n; i++){
            if (n%i==0)
                return false;
        }
        return true;
    }

//    efficient method -- bigO(square root of n)
    public static boolean Prime(int n){
        if(n==1)
            return false;
        for(int i=2; i*i<=n; i++){
            if (n%i==0)
                return false;
        }
        return true;
    }

//    more efficient solution
   public static boolean EfficientPrime(int n){
        if (n==1) return false;
        if (n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for (int i=5; i*i<=n; i+=6)
            if (n%i==0 || n%(i+2)==0) return false;
        return true;


   }
}
