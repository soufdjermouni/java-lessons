package com.interview.thread.watertank;

public class WaterTank {

    private final int capacity; // Maximum capacity of the water tank
    private int currentWaterLevel; // Current water level in the tank
    private boolean empty; // Flag to track if the tank is empty


    public WaterTank(int capacity) {
        this.capacity = capacity;
        this.currentWaterLevel = 0; // Initially, the tank is empty
        this.empty = true; // Initially, the tank is empty
    }

    public synchronized void fill(int amount) {
        if (currentWaterLevel + amount <= capacity) {
            currentWaterLevel += amount;
            System.out.println("Filled " + amount + " liters of water.");
            System.out.println("Current water level: " + currentWaterLevel + " liters");
        } else {
            System.out.println("Cannot fill. Tank is full.");
        }
    }

    public synchronized void drain(int amount) {
        if (currentWaterLevel - amount >= 0) {
            currentWaterLevel -= amount;
            System.out.println("Drained " + amount + " liters of water.");
            System.out.println("Current water level: " + currentWaterLevel + " liters");
        } else {
            System.out.println("Cannot drain. Tank is empty.");
        }
    }

    public synchronized boolean isEmpty() {
        return empty;
    }
    public synchronized void setEmpty(boolean isEmpty) {
        this.empty = isEmpty;
    }
    public synchronized int getCurrentWaterLevel() {
        return currentWaterLevel;
    }
    public synchronized int getCapacity() {
        return capacity;
    }

}
