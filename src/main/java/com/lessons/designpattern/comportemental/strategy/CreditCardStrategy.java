package com.lessons.designpattern.comportemental.strategy;

import java.time.LocalDate;

public class CreditCardStrategy implements PayementStrategy{
    private String cardNumber;
    private String cryptogram;
    private LocalDate expirationDate;

    public CreditCardStrategy(String cardNumber, String cryptogram, LocalDate expirationDate){
        this.cardNumber=cardNumber;
        this.cryptogram=cryptogram;
        this.expirationDate=expirationDate;
    }
    @Override
    public void pay(int amout) {
        System.out.println(amout + "$ paid by credit card");
    }
}
