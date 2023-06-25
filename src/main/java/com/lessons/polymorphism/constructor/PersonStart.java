package com.lessons.polymorphism.constructor;

public class PersonStart {

    public static void main(String[] args) {
        Person unknown = new Person();
        Person john = new Person("John", "Smith");
        Person jane = new Person("Jane", "Doe", 25);
        System.out.println(john.toString());
    }
}
