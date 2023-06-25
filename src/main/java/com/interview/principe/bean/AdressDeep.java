package com.interview.principe.bean;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class AdressDeep {
    private String street;
    private String city;
    private String country;

    public AdressDeep(AdressDeep that) {
        this(that.getStreet(), that.getCity(), that.getCountry());
    }

    public AdressDeep(String street, String city, String country) {
        this.street=street;
        this.city=city;
        this.country=country;
    }
}
