package com.interview.algorithm.entier;

import java.util.ArrayList;
import java.util.List;

public class CarresListeEntier {
    public static void main(String[] args) {
        carres(List.of(5,6,8,3,4)).stream().forEach(System.out::println);
    }
    public static List<Integer> carres(List<Integer> nombres) {
        List<Integer> carres = new ArrayList<>();
        for (int n : nombres) {
            carres.add(n * n);
        }
        return carres;
    }
}
