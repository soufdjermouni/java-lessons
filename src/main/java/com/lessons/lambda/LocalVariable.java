package com.lessons.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LocalVariable {
    public static void main(String[] ccccccc) {

        //This JEP adds support for the var keyword in lambda parameters.
        List<String> list = Arrays.asList("a","b","c");
        String result = list.stream()
                .map(( var x) -> x.toUpperCase())
                .collect(Collectors.joining(","));
        System.out.println(result);
    }
}
