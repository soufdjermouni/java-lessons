package com.interview.principe.bean;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Address {

    private String street;
    private String city;
    private String country;

}
