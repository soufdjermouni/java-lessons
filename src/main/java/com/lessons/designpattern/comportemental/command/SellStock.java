package com.lessons.designpattern.comportemental.command;

public class SellStock implements  OrderCommand{

    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
