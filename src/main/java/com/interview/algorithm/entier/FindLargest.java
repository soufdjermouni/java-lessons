package com.interview.algorithm.entier;

import java.util.Arrays;

public class FindLargest {
    public static void main(String[] args) {
        int [] numbers = {1, -28, 88, 200, 7};
        System.out.println(findLargest(numbers));
        System.out.println(findLargestWithStream(numbers));
    }

    private static int findLargestWithStream(int[] numbers) {
        return  Arrays.stream(numbers).max().getAsInt();
    }

    private static int findLargest(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length-1; i++) {
            if(numbers[i] > result ){
                result = numbers[i];
            }
        }
        return result;
    }
}
