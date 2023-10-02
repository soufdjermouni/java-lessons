package com.lessons.interfacefonctionnelle.consumer;

import java.util.ArrayList;
import java.util.List;

public class ConsumerForEach {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<String>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        //Stream.forEach (//Consummer)
        strings.forEach(s -> System.out.println(s));

        //Stream.forEach (//Consummer with referenced method )
        strings.forEach(System.out::println);
    }
}
