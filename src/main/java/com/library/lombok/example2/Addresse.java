package com.library.lombok.example2;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder(toBuilder = true)
public class Addresse {

    private String street;
    private String city;
    private String country;

}
