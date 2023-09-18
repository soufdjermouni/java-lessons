package com.interview.codinggame.nextinteger;

public class NextIntegerSolBest {

    public static int next(int n) {
        if (n <= 0) {
            return 1; // Si n n'est pas strictement positif, retourner 1
        }

        // Convertir n en chaîne de caractères pour récupérer les chiffres
        String nStr = Integer.toString(n);

        // Créer un tableau de booléens pour suivre les chiffres déjà utilisés
        boolean[] usedDigits = new boolean[10];

        // Marquer les chiffres de n comme utilisés
        for (char digitChar : nStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            usedDigits[digit] = true;
        }

        // Chercher le plus petit entier supérieur à n avec des chiffres distincts
        int next = n + 1;
        while (true) {
            boolean allDigitsDistinct = true;
            String nextStr = Integer.toString(next);
            for (char digitChar : nextStr.toCharArray()) {
                int digit = Character.getNumericValue(digitChar);
                if (usedDigits[digit]) {
                    allDigitsDistinct = false;
                    break;
                }
            }
            if (allDigitsDistinct) {
                return next;
            }
            next++;
        }
    }

    public static void main(String[] args) {

        System.out.println("Next integer with distinct digits: " + next(2)); //3
        System.out.println("Next integer with distinct digits: " + next(901)); //2222
        System.out.println("Next integer with distinct digits: " + next(958)); //1000
        System.out.println("Next integer with distinct digits: " + next(3025)); //4111
        System.out.println("Next integer with distinct digits: " + next(654321)); //700000
    }

}
