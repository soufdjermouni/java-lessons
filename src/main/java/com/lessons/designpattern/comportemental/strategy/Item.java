package com.lessons.designpattern.comportemental.strategy;

public class Item {

    private String name;
    private int price;

    public Item (String name, int price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public  void pay(PayementStrategy strategy) {
        int amount = this.getPrice();
        strategy.pay(amount);
    }
}
