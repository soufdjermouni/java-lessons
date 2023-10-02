package com.lessons.lambda;

import org.springframework.core.convert.converter.Converter;

interface Maths {
    double calculate(int a);
    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}

public class ExampleMaths {
    public static void main(String[] args) {

        //Maths maths = (a) -> sqrt(a*100);//Cannot resolve method 'sqrt' in 'ExampleMaths', error de compilation

        Maths maths = (a) -> a*100;
        double result = maths.calculate(10);
        System.out.println(result);//1000

        double racine = maths.sqrt(16);
        System.out.println(racine);//4
    }

    public void func1(){
       int num =1;
       /*Converter<Integer, String> stringConcerter =
                (from) -> String.valueOf(from+num);//Variable used in lambda expression should be final or effectively final

        */
       num = 3;
    }
}

