package com.lessons.designpattern.comportemental.command;

public class BuyStock implements OrderCommand{

    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
