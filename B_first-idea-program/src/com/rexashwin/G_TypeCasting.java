package com.rexashwin;

import java.util.Scanner;

public class G_TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        float fnum = input.nextFloat();
//        float fnum = input.nextInt();
//        int inum = input.nextInt();
//        System.out.println(fnum);
//        System.out.println(inum);
        /*  int can be provided and converted to float
            but float cannot be converted to int
        */

//        //  TypeCasting
//        int num = (int)(67.56f);
//        System.out.println(num);

////        ## automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a);   // 257 % 256 = 1
//        System.out.println(b);

//        byte c = 40;
//        byte d = 50;
//        byte e = 100;
//        int f = (c * d) / e;    // automatic converting byte to int then evaluating the expression
//        System.out.println(f);

//        byte g = 50;
//        g = g * 2;      //  this will give error as int can't be assigned to byte   // typecasting can be performed

//        int h = 'a';
//        int i = 'A';
//        System.out.println(h);
//        System.out.println(i);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + "\t" + (i / c) + "\t " + (d * s));
        System.out.println(result);
    }
}
