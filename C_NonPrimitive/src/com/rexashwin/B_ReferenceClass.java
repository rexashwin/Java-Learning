//  non-primitive data types variable are always references

package com.rexashwin;

class point2{
    int x;
    int y;
}

public class B_ReferenceClass {
    public static void main(String[] args) {
        point2 p1 = new point2();
        p1.x = 10;
        p1.y = 20;
        point2 p2 = p1;
        p2.x = 30;
        System.out.println(p1.x);
        System.out.println(p2.x );
    }
}
