package com.version.java17;

import com.fasterxml.jackson.databind.util.JSONPObject;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class New3PatternMatchingForTheSwitch {

    public static void main(String[] args) {



    }

    /**
    static String asStringValue(Object anyValue) {

        return switch (anyValue) {
            case String str      -> str;
            case JSONPObject json -> json.toString();
            case BigDecimal bd   -> bd.toEngineeringString();
            case Integer i       -> Integer.toString(i);
            case LocalDate ld    -> ld.format(DateTimeFormatter.ISO_LOCAL_DATE);
            default              -> "n/a";
        };
    }
     */

    /**
     * //TODO upgrade to java 21
     * static double getDoubleUsingSwitch(Object o) {
        return switch (o) {
            case Integer i -> i.doubleValue();
            case Float f -> f.doubleValue();
            case String s -> Double.parseDouble(s);
            default -> 0d;
        };
    }*/
}
