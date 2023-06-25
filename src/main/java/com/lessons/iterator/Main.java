package com.lessons.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Création d'une ArrayList de chaînes de caractères
        ArrayList<String> fruits = new ArrayList<String>();

        // Ajout de quelques éléments à l'ArrayList
        fruits.add("pomme");
        fruits.add("banane");
        fruits.add("orange");
        fruits.add("mangue");

        // Création d'un objet Iterator pour parcourir la liste des fruits
        Iterator<String> it = fruits.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("---------------------");
        fruits.stream().forEach(e -> System.out.println(e));
        List<String> fruitsg = fruits.stream().filter(e -> e.contains("g")).collect(Collectors.toList());
        System.out.println("--------------");
        fruitsg.stream().forEach(e -> System.out.println(e));
    }
}
