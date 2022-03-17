package com.rexashwin;

import java.util.Scanner;

public class C7_AllDivisors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

//        my solution -- theta(num)
        for(int i=1; i<=num; i++){
            if(num%i==0)
                System.out.println(i);
        }

//        efficient solution but not prints in order -- theta(square root of num)
        for(int i=1; i*i<=num; i++){
            if(num%i==0){
                System.out.println(i);
                if (i != num/i)
                    System.out.println(num/i); 
            }
        }

//        efficient solution prints in order -- theta(num)
        int i;
        for (i=1; i*i<num; i++){
            if (num%i==0)
                System.out.println(i);
        }
        for ( ; i>=1; i--){
            if(num%i==0)
                System.out.println(num/i);
        }
    }
}
