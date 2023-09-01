package com.lessons.stream.exception;

import io.vavr.control.Try;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BankTestExcpetionStream {

    private static Map<String, Account> accounts;
    public static void main(String[] args) throws IOException {
        accounts = new HashMap<>();
        Account a = Account.builder()
                .active(true)
                .number("062252552").build();

        accounts.put("Cle", a);
        getActiveAccountNumbers();

    }

    public static Set<String> getActiveAccountNumbers() throws IOException {
        //try { //même avec un bloc try catch, ça ne marche pas
        Stream<Account> s =  accounts.values().stream();
        //s = s.filter(a -> a.isActive());    //without catch expection, i have Unhandled exception: java.io.IOException
        s = s.filter(a -> {
            try {
                return a.isActive();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        });

        //Stream<String> ss = s.map(a -> a.getNumber()); //without catch expection, i have Unhandled exception: java.io.IOException
        Stream<String> ss = s.map(a -> {
            try {
               return a.getNumber();
            }catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        });
        return ss.collect(Collectors.toSet());
    }
}
