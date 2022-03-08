package com.rexashwin;

//To find out whether the given String is Palindrome or not.

public class A7_Palindrome {
    public static void main(String[] args) {
        int num = 16561, temp, rem, sum=0;

        temp = num;

        while(num > 0){
            rem = num % 10;
            sum = (sum*10)+rem;
            num = num/10;
        }
        if (temp == sum)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
