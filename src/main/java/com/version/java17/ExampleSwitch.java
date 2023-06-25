package com.version.java17;

import java.time.DayOfWeek;

public class ExampleSwitch {

    public static void main(String[] args) {

        DayOfWeek day = DayOfWeek.FRIDAY;
        int numOfLetters = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY                -> 7;
            case THURSDAY, SATURDAY     -> 8;
            case WEDNESDAY              -> 9;
        };

        System.out.println(day);
    }
}
