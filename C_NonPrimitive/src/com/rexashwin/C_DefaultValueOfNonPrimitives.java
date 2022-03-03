package com.rexashwin;

class point3{
    int x;
    int y;
    boolean z;
    float f;
}
public class C_DefaultValueOfNonPrimitives {
    public static void main(String[] args) {
        point3 p = new point3();
        System.out.println(p.x);
        System.out.println(p.y);
        System.out.println(p.z);
        System.out.println(p.f);

//        for primitive data types, if values are not initialized then the compiler will give error
//        int a;
//        System.out.println(a);
    }
}
