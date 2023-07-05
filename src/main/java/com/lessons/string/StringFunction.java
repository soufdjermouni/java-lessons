package com.lessons.string;

public class StringFunction {

    public static void main(String[] args) {

        String str = " ";
        //isBlank : It returns true, if the given string is empty or having only the
        //spaces.
        System.out.println(str.isBlank()); //true

        //strip : like trim
        String str1 = " ici ";
        System.out.println(str1.strip());//"ici" sans les espaces début et fin

        String sample = " Karthik ";
        //stripLeading
        System.out.println(sample.stripLeading());//"Karthik "
        //stripTrailing
        System.out.println(sample.stripTrailing()); //" Karthik"
    }
}
