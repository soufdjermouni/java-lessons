package com.interview.algorithm;

import java.util.Scanner;

public class CheckIfNombrePremier {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Entrez un nombre: ");

        while(input.hasNext()) {
           int number = input.nextInt();

            boolean isPrime = false;

            if (number < 1) {
                isPrime = false;
            } else {
                if (number % 2 == 0) {
                    isPrime = false;
                } else {
                    isPrime = true;
                }

            }

            if (isPrime) {
                System.out.println(number + " est un nombre premier.");
            } else {
                System.out.println(number + " n'est pas un nombre premier.");
            }
        }


    }
}
