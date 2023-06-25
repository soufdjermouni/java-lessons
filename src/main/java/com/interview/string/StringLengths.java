package com.interview.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLengths {

    public static void main(String[] args) {
        // prepare a list of strings
        List<String> strings = Arrays.asList("abcdef", "ab", "fbi", "govt", "scaler", "java");

        // convert the list to stream then use the map method
        List<Integer> lengthOfStrings = strings.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(lengthOfStrings);

    }
}
