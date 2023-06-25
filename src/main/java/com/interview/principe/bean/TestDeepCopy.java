package com.interview.principe.bean;

public class TestDeepCopy {

    public static void main(String[] args) {
        AdressDeep address = new AdressDeep("Downing St 10", "London", "England");
        UserDeep pm = new UserDeep("Prime", "Minister", address);
        UserDeep deepCopy = new UserDeep(pm);

        address.setCountry("Great Britain");
        System.out.println(pm.getAdressDeep().getCountry().equals(deepCopy.getAdressDeep().getCountry()));//false


    }
}
