//  every class is a non-primitive data type

package com.rexashwin;

//  example of non-primitive variables are reference
class point{
    int x;
    int y;
}
public class A_Class {
    public static void main(String[] args) {
        point p = new point();
        p.x = 10;
        p.y = 20;
        System.out.println(p.x + " " + p.y);
    }
}

//  example of primitive variables which are not reference variable
//public class A_Class {
//    public static void main(String[] args) {
//        int x = 10;
//        int y = x;
//        y = 20;
//        System.out.println(x);
//        System.out.println(y);
//    }
//}