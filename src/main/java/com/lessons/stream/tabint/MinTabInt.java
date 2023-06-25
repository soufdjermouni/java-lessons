package com.lessons.stream.tabint;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinTabInt {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);
        Optional<Integer> var = list.stream().min(Integer::compare);
        if (var.isPresent()) {
            System.out.println(var.get());
        }
    }
}
