package com.lessons.designpattern.creation.builder;

public class StartBuilder {
    public static void main(String[] args) {
        StudentBuilder john = StudentBuilder.builder()
                .firstName("John")
                .lastName("Doe")
                .build();
        System.out.println(john.toString());

        StudentBuilder john2 = StudentBuilder.builder()
                .firstName("John")
                .lastName("Doe")
                .address("street")
                .phoneNumber("0654563663663")
                .build();

    }
}
