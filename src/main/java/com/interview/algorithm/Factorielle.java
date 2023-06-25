package com.interview.algorithm;

import java.util.Scanner;

public class Factorielle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int number = input.nextInt();

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial*i;
        }
        System.out.println("Le factoriel de " + number + " est : " + factorial);


    }
}
