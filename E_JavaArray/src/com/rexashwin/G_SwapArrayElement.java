package com.rexashwin;

import java.util.Arrays;

public class G_SwapArrayElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        swap(arr, 1, 2);
        System.out.println("after swaping");
        System.out.println(Arrays.toString(arr));
        reverse(arr);
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.print("reversed array : ");
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
