package com.lessons.lambda.lambdaex1;

import com.lessons.lambda.lambdaex1.Cat;
import com.lessons.lambda.lambdaex1.Printable;
import com.lessons.lambda.lambdaex1.PrintableWithParam;

public class LambdasEx {
    public static void main(String[] args) {


        //1- Lambda method without paramaters
        Cat cat = new Cat();
        printThing(cat);//meaw

        printThing(
             () -> {
                System.out.println("hello!");
            }
        ); //hello!

        //Une autre écriture
        Printable lambdaPrintable = () -> System.out.println("Hihi!");
        printThing(lambdaPrintable); //Hihi!

        //2- Lambda method with paramaters
        PrintableWithParam PrintableWithParamLambda = (p,s) -> {
            System.out.println(p + "With Params" + s);
            return p + "With Params" + s;

        };
        printThingArgs(PrintableWithParamLambda);//So, With Params!
        //or
        PrintableWithParam PrintableWithParamLambdaV2 = (p,s) -> p + "With Params" + s;
        printThingArgs(PrintableWithParamLambdaV2); //So, With Params!



    }

    static void printThing(Printable thing) {
        thing.print();
    }

    static void printThingArgs(PrintableWithParam thing) {
        thing.print("So, ","!");
    }
}
