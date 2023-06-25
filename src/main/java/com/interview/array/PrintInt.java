package com.interview.array;

import java.util.Arrays;

//Some times when u see very simple problem u always think this is not something is wrong about and that's i will
// 2 minute to think is that it is
public class PrintInt {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
