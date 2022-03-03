package com.rexashwin;

//To find Armstrong Number between two given number.

public class H_Armstrong {
    public static void main(String[] args) {
        int num = 153, temp, rem, sum=0;

        temp = num;

        while(num > 0){
            rem = num % 10;
            sum = (rem*rem*rem) + sum;
            num = num/10;
        }
        if (temp == sum)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
