package com.craftsmanship.cleancode;

import java.util.Optional;

public class ExceptionOrElseThrow {

    public static void main(String[] args) throws Exception {

        Optional<Integer> optional1 = Optional.of(1);
        Integer val =  optional1.orElseThrow(()-> {
            return new Exception("no value present in Optional bject");
        });
        System.out.println("Value at Optional1 is : " + val);

        Optional<Integer> optional2 = Optional.empty();
        System.out.println("\nOptional2 : " + optional2);
        val =  optional2.orElseThrow(()-> {
            return new Exception("no value present in Optional object");
        });
    }
}
