package com.interview.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestFlatMap {

    public static void main(String[] args) {
        List<Integer> evens = Arrays.asList(4, 6, 8);
        List<Integer> odds = Arrays.asList(3, 5, 7);
        List<Integer> primes = Arrays.asList(2, 3, 5);

        // creates a list of list of numbers - a nested list
        List<List<Integer>> listOfListOfNumbers = Arrays.asList(evens, odds, primes);

        System.out.println("Before flattening: " + listOfListOfNumbers);

        List<Integer> allDistinctNumbers = listOfListOfNumbers.stream()
                .flatMap(numList -> numList.stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println("After flattening, all distinct numbers: " + allDistinctNumbers);
    }
}
