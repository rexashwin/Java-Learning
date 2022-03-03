package com.rexashwin;
// to check : static variable memory allocation happens only once

public class D_StaticVariable {

    static int staticVar = 10;

    void fun(){
        int localVar = 10;
        System.out.println(localVar + " " + staticVar);
        ++localVar;
        ++staticVar;
    }

    public static void main(String[] args) {
        D_StaticVariable ref = new D_StaticVariable();
        ref.fun();
        ref.fun();
    }
}
