package com.lessons.designpattern.comportemental.command;

import java.util.ArrayList;
import java.util.List;

public class BrokerInvoker {

    private List<OrderCommand> orderList = new ArrayList<OrderCommand>();

    public void takeOrder(OrderCommand order){
        orderList.add(order);
    }

    public void placeOrders(){

        for (OrderCommand order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
