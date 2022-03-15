package com.rexashwin;

import java.util.Scanner;

public class C6_LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt(), lcm = 1;

//        my sol.
        for (int i=a*b; i>1; i--){
            if(i%a==0 && i%b==0)
                lcm = i;
        }
        System.out.println(lcm);

//        gfg-sol.
        for (int i=Math.max(a,b); i<=a*b; i++){
            if(i%a==0 && i%b==0) {
                lcm = i;
                break;
            }
        }
        System.out.println(lcm);
    }
}
