package com.rexashwin;

import java.util.Arrays;

public class D_ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,6};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr1){
        arr1[0] = 99;   // if you make a change to the object via this ref variable, same object will be changed
    }
}
