package com.interview.principe.bean;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User {

    private String firstName;
    private String lastName;
    private Address address;


}
