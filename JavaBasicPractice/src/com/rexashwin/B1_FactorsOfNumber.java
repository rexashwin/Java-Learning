package com.rexashwin;

//Input a number and print all the factors of that number

public class B1_FactorsOfNumber {
    public static void main(String[] args) {
        int num = 63;
        System.out.print("all divisor of "+num+" are : ");
        printDivisors(num);
    }

    static void printDivisors(int num) {
        for (int i=1; i<=num; i++){
            if (num%i==0)
                System.out.print(i+" ");
        }
    }
}
