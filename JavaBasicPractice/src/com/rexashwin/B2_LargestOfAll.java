package com.rexashwin;

//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class B2_LargestOfAll {
    public static void main(String[] args) {
        int num, sum=0;
        char quit='y';

        Scanner in =  new Scanner(System.in);

        while(quit!='x'){
            System.out.print("Enter your number : ");
            num = in.nextInt();
            if (num>sum){
                sum = num;
            }
            System.out.print("Want to enter more number? enter 'y' for yes 'x' for no : ");
            quit = in.next().charAt(0);
        }
        System.out.println("Largest of all entered number is : "+sum);
    }
}
