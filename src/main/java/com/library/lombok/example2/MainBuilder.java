package com.library.lombok.example2;

public class MainBuilder {

    public static void main(String[] args) {

        //Tester le @Builder(toBuilder = true)
        Addresse add = Addresse.builder()
                .city("Paris")
                .country("France")
                .street("1 rue toto")
                .build();
        Addresse addr2 = add.toBuilder()
                .city("Reims").build();
        System.out.println(addr2.getStreet());//1 rue toto

    }
}
