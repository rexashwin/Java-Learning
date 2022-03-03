package com.rexashwin;

public class C_Variable {

    static int static_var = 20;
    int instance_var = 30;

    public static void main(String[] args) {
        int local_var = 10;
        System.out.println(local_var);

//         to access static variable -- className.variableName
        System.out.println(C_Variable.static_var);

//         to access instance variable
//         first create a class object then access instance variable through reference object
        C_Variable ref = new C_Variable();
        System.out.println(ref.instance_var);


    }
}
