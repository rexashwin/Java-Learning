package com.rexashwin;

public class G_MaxOfArrayElement {
    public static void main(String[] args) {
        int[] arr = {1,2,6,4,5};
        System.out.println(maxOf(arr));
    }

    static int maxOf(int[] arr) {
        int max = arr[0];
        for(int i=0; i<5; i++){
            if(max<arr[i])
                max = arr[i];
        }
        return max;
    }
}
