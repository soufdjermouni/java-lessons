package com.interview;

import java.util.Arrays;

public class AATest {

    public static void main(String[] args) {
       int [] numbers = new int[]{4, 6, 1, 8, 3};
        System.out.println(Arrays.stream(numbers).max().getAsInt());

    }
}
