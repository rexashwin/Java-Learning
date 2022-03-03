package com.rexashwin;

import java.util.Arrays;

public class G_VariableArguments {
    public static void main(String[] args) {
        fun(2,3,4,5,6,77);
        multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc");
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
