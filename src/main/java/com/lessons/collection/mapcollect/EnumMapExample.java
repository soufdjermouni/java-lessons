package com.lessons.collection.mapcollect;

import java.util.EnumMap;

public class EnumMapExample {

    public static void main(String[] args) {

        EnumMap<DayOfWeek,String> activityMap = new EnumMap<>(DayOfWeek.class);
        activityMap.put(DayOfWeek.MONDAY, "Soccer");


    }

    public enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
