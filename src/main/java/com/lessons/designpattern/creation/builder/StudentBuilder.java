package com.lessons.designpattern.creation.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class StudentBuilder {
    private String firstName;
    private String lastName;
    private Long studentId;
    private String email;
    private String phoneNumber;
    private String address;
    private String country;
    private int age;
}
