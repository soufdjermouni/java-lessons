package com.interview.algorithm;

import java.util.Scanner;

public class NombresPremiers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre entier positif: ");
        int n = sc.nextInt();
        System.out.println("Les nombres premiers inférieurs à " + n + " sont:");
        for (int i = 2; i < n; i++) {
            boolean estPremier = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    estPremier = false;
                    break;
                }
            }
            if (estPremier) {
                System.out.print(i + " ");
            }
        }
    }
}
