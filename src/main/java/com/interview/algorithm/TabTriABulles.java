package com.interview.algorithm;

import java.util.Arrays;

public class TabTriABulles {

    public static void main(String[] args) {

        int[] numbers = { 5, 2, 8, 3, 1, 6, 9, 4, 7 };

        int temp;

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 0; j < (numbers.length-i-1) ; j++) {

                if(numbers[j]> numbers[j+1]){
                    //echanges des elements
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }

            }
        }

        Arrays.stream(numbers).forEach(e -> System.out.println(e));
    }
}
