package com.lessons.record;

public record Person(String name, int age) {
    public Person {
        if(age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}
