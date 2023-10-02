package com.lessons.decimal;


import java.math.BigDecimal;
import java.math.RoundingMode;

// numbers always containes valid floating numbers expressed in the from of string
public class ExampleBiDecimal {

    static class Calculator {
        public static String sum(String... numbers) {
           /* double total = 0;
            for (String number:numbers){
                total = total+ Double.parseDouble(number);
            } */
            BigDecimal sum = BigDecimal.ZERO;
            for (String number : numbers) {
                sum = sum.add(new BigDecimal(number));
            }


            return  String.valueOf(sum.setScale(3, RoundingMode.HALF_UP));
        }
    }
    public static void main(String[] args) {
        System.out.println(Calculator.sum("99.35","1.10"));
    }
}
