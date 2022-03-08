package com.rexashwin;

//Subtract the Product and Sum of Digits of an Integer

public class A9_SubtractProductAndSumOfDigitOfNumber {
    public static void main(String[] args) {
        int num=158, rem, sum=0, prod=1;
        while(num>0){
            rem = num % 10;
            sum = sum + rem;
            prod = prod * rem;
            num = num/10;
        }
        System.out.println(prod-sum);
    }
}
