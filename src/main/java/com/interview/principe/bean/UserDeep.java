package com.interview.principe.bean;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserDeep {

    private String firstName;
    private String lastName;
    private AdressDeep adressDeep;

    public UserDeep(UserDeep that) {
        this(that.getFirstName(), that.getLastName(), new AdressDeep(that.getAdressDeep()));
    }

    public UserDeep(String firstName, String lastName, AdressDeep adressDeep) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.adressDeep=adressDeep;
    }
}
