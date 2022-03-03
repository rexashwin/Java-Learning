package com.rexashwin;

import java.util.Arrays;

public class H_Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("Ashwin");

        int ans = sum(3, 4, 78);
        System.out.println(ans);

        int ans2 = sum(5, 8);
        System.out.println(ans2);

        demo(2,3,4);
        demo("ashwin", "raj");

    }

    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }
}
