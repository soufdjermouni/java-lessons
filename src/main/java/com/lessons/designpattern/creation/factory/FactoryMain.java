package com.lessons.designpattern.creation.factory;

public class FactoryMain {
    public static void main(String[] args) {
        String country = args[0];
        Currency currency= CurrencyFactory.createCurrency(country);
        System.out.println(currency.getSymbol());
    }
}
