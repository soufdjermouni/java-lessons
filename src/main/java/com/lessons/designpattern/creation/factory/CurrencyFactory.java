package com.lessons.designpattern.creation.factory;

//Factroy class code
public class CurrencyFactory {
    public static Currency createCurrency(String country){
        if(country.equals("Europe")) {
            return new Euro();
        } else if (country.equals("USA")) {
            return new USDollar();
        } else if (country.equals("Japan")) {
            return new Yen();
        }
        throw new IllegalArgumentException("No such currency");
    }
}
