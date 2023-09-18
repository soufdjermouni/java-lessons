package com.interview.algorithm.dates;

import java.time.LocalDate;

public class LocalDatePlusMonth {

    public static void main(String[] args) {
        System.out.println(LocalDate.of(2016,1,31).plusMonths(1));//2016-02-29
    }
}
