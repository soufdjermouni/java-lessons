package com.interview.algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Écrivez un programme Java pour trouver le plus grand élément dans un tableau d'entiers.
 */
public class FindBigElementInTabInt {
    public static void main(String[] args) {

        int[] numbers = { 5, 2, 8, 3, 1, 6, 9, 4, 7 };
        List<Integer> listNumbers = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        Integer el2 = listNumbers.stream().reduce((a, b) -> a > b ? a : b).get();
        Integer max = Collections.max(listNumbers);
        System.out.println(max);
        System.out.println(el2);
        System.out.println(
                listNumbers.stream().max(Integer::compare).get()
        );
        System.out.println("HOLA = "+Arrays.stream(numbers).max().getAsInt());

        //another way
        int maxi = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > maxi) {
                maxi=numbers[i];
            }
        }
        System.out.println("maxi="+maxi);

    }
}
