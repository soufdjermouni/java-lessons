package com.interview.algorithm;

public class MinimumNumberOfCars {

    public static void main(String[] args) {
        System.out.println(minimumNumberOfCars(new int []{2,3,4}, 2));
    }
    public static int minimumNumberOfCars(int[] passengers, int capacity) {
        int numCars = 0;
        int numPassengers = 0;
        for (int i = 0; i < passengers.length; i++) {
            if (numPassengers + passengers[i] > capacity) {
                numCars++;
                numPassengers = 0;
            }
            numPassengers += passengers[i];
        }
        if (numPassengers > 0) {
            numCars++;
        }
        return numCars;
    }

}
