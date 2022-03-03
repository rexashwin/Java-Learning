package com.rexashwin;

import java.util.Scanner;

public class K_ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = 12345, temp, ans = 0;
        num = input.nextLong();
        while (num>0){
            temp = num % 10;
            ans = ans * 10 + temp;
            num /= 10;
        }
        System.out.println(ans);
    }
}
