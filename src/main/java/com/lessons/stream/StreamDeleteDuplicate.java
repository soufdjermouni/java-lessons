package com.lessons.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDeleteDuplicate {

    public static void main(String[] args) {
        List<String> h = new ArrayList<>();
        h.add("e1");
        h.add(null);
        h.add("e1");

        h = h.stream().distinct().collect(Collectors.toList());
        h.forEach(System.out::println);
    }
}
