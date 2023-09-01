package com.library.vavr;

import io.vavr.control.Try;

public class ExempleTryOf {

    public static void main(String[] args) {
        Try<Integer> result = Try.of(() -> 1 / 0);

        System.out.println(result.isFailure());

    }
}
