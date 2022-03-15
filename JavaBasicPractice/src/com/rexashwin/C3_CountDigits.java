package com.rexashwin;

import java.util.Scanner;

public class C3_CountDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;
        while (num!=0){
            num = num/10;
            count++;
        }
        System.out.println(count);
    }

}
