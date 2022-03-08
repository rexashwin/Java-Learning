package com.rexashwin;

//Take integer inputs till the user enters 0 and print the sum of all numbers

import java.util.Scanner;

public class B0_SumOfAllInputs {
    public static void main(String[] args) {
        int num, sum=0;
        char quit='y';

        Scanner in =  new Scanner(System.in);

        while(quit!='x'){
            System.out.print("Enter your number : ");
            num = in.nextInt();
            sum = sum + num;
            System.out.print("Want to enter more number? enter 'y' for yes 'x' for no : ");
            quit = in.next().charAt(0);
        }
        System.out.println("Sum of entered number is : "+sum);
    }
}
