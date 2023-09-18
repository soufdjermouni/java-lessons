package com.lessons.designpattern.comportemental.strategy;

public class PaypalStrategy implements PayementStrategy{
    private String id;
    private String password;

    public PaypalStrategy(String email, String pass){
        this.id=id;
        this.password=pass;
    }
    @Override
    public void pay(int amout) {
        System.out.println(amout + "$ paid by Paypal");
    }
}
