package com.interview.algorithm.chaine;

import java.util.Scanner;

public class InverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String str = scanner.nextLine();
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        System.out.println(reverse);
    }
}
