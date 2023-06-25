package com.lessons.immuable;

public class ImmuableObject {

    public static void main(String[] args) {
        //La classe String est immuable
        String s = "ABC";
        System.out.println(s.toLowerCase());
        System.out.println(s);//La valeur de "s" ne sera pas modifiée. Au lieu de cela, un nouvel objet String est instancié, et la valeur "abc"
        // lui est attribuée lors de sa construction


        //2. Classe Currency
        Currency cur = Currency.of("5");
        System.out.println(cur.getValue());
        Currency.of("10");
        System.out.println(cur.getValue());
    }
}
