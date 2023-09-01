package com.lessons.stream.exception;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ExceptionHandlingInJavaStreams {
    public static List<String> myList = Arrays.asList("e1","e2","e3");

    public static void main(String[] args) {

        //façon 1

        myList.stream()
                .map(item -> {
                    try {
                        return doSomething(item);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                })
                .forEach(System.out::println);//E1 E2 E3

        //façon 2
        ExceptionHandlingInJavaStreams2 classe = new ExceptionHandlingInJavaStreams2();
        classe.process();
    }

    private static String doSomething(String item) throws IOException {
        if(null == item || item.isBlank()) throw new IOException();
        return item.toUpperCase();
    }



    private static class ExceptionHandlingInJavaStreams2 {
        public void process() {
            myList.stream()
                    .map(this::trySomething)
                    .forEach(System.out::println);
        }

        public String trySomething(String item) {
            try {
                return doSomething(item);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
