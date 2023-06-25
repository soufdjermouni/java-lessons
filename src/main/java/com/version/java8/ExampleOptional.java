package com.version.java8;

import java.util.Optional;

public class ExampleOptional {


    public static void main(String[] args) {

        String name = "baeldung";
        Optional<String> opt = Optional.of(name);
        if(opt.isPresent()){
            String myValue = opt.get();
            System.out.println(myValue);
        }

        opt = Optional.ofNullable(null);
        System.out.println(opt.isEmpty());

        Optional<String> opt2 = Optional.of("Valentin");
        opt2.ifPresent(nom -> System.out.println(nom));
    }
}
