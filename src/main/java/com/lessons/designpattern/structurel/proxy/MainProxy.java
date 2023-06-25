package com.lessons.designpattern.structurel.proxy;

public class MainProxy {

    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        Calculator proxy = CalculatorProxy.createProxy(calculator);
        int sum = proxy.add(2, 3);
        int diff = proxy.subtract(5, 2);
    }
}
