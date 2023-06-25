package com.lessons.designpattern.structurel.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class CalculatorProxy implements InvocationHandler {

    private Object calculator;
    public CalculatorProxy (Object calculator){
        this.calculator=calculator;
    }

    public static Calculator createProxy(Object calculator){

        ClassLoader loader = calculator.getClass().getClassLoader();
        Class<?>[] interfaces = calculator.getClass().getInterfaces();
        CalculatorProxy handler = new CalculatorProxy(calculator);
        return (Calculator) Proxy.newProxyInstance(loader,interfaces,handler);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Calling " + method.getName() + " with arguments " + Arrays.toString(args));
        Object result = method.invoke(calculator, args);
        return null;
    }
}
