package com.lessons.stream.optional;

import java.util.Optional;

public class MapInOptionals {

    public static void main(String[] args) {

        // creating an optional with a value present in it
        Optional<String> optionalString = Optional.of("This is a test string");

        // creating an optional with no value in it
        Optional<String> emptyOptionalString = Optional.ofNullable(null);

        // map here returns another optional with all uppercase characters
        System.out.println(optionalString.map(String::toUpperCase));

        // map here returns an empty optional because no value is present
        System.out.println(emptyOptionalString.map(String::toUpperCase));
    }
}
