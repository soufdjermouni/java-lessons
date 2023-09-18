package com.interview.codinggame.nextinteger;

public class NextSmallEntierDifferent {
    public static void main(String[] args) {
        System.out.println(next(2)); // 3
        System.out.println("Next integer with distinct digits: " + next(2)); //3
        System.out.println("Next integer with distinct digits: " + next(54)); //60
        System.out.println("Next integer with distinct digits: " + next(901)); //2222
        System.out.println("Next integer with distinct digits: " + next(958)); //1000
        System.out.println("Next integer with distinct digits: " + next(3025)); //4111
        System.out.println("Next integer with distinct digits: " + next(654321)); //700000
    }

    public static int next(int n) {
        if (n <= 0 || n >= Math.pow(2, 31)) {
            return 1;
        }

        //Convertir n en String  ppur récupérer les digits
        String nStr = String.valueOf(n);

        //Initilialiser le tableau des digits utilisé dans n
        boolean[] usedDigits = new boolean[10]; // [0-9]
        for (char digitChar : nStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            usedDigits[digit] = true;
        }

        // Chercher le plus petit entier supérieur à n avec des chiffres distincts
        //int next = n+1;
        int result = n+1;
        for (int next = n + 1; n < Math.pow(2, 31); n++) {
            boolean allDigitsDistinct = true;
            String nextStr = String.valueOf(next);
            for (char digitChar : nextStr.toCharArray()) {
                int digit = Character.getNumericValue(digitChar);
                if (usedDigits[digit]) {
                    allDigitsDistinct = false;
                    break;
                }
            }

            if (allDigitsDistinct) {
                result = next;
                break;
            }
            next++;
        }
        return result;
    }
}



