package com.lessons.polymorphism.constructor;

import lombok.Getter;

//As you can observe in the code above, we defined 3 constructors: an empty constructor, a constructor with 2 arguments and one with three,
// and all of them have the same name.
@Getter
public class Person {
    private String name;
    private String surname;
    private int age;

    public Person() {}

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
