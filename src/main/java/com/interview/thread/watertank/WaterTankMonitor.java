package com.interview.thread.watertank;

public class WaterTankMonitor {

    private WaterTank tank; // water tank monitored

    public WaterTankMonitor(WaterTank tank) {
        this.tank = tank;
    }

    public synchronized void empty() {
        while (tank.isEmpty()){
            int currentLevel = tank.getCurrentWaterLevel();
            tank.drain(currentLevel);
            System.out.println("Emptied the tank. Current water level: " + tank.getCurrentWaterLevel() + " liters");
        }
        tank.setEmpty(true);
    }

    public synchronized void fill() {
        while (tank.isEmpty()) {
            int currentLevel = tank.getCurrentWaterLevel();
            if (currentLevel < tank.getCapacity()) {
             int spaceLeft = tank.getCapacity() - currentLevel;
                tank.fill(spaceLeft);
             System.out.println("Filled the tank. Current water level: " + tank.getCurrentWaterLevel() + " liters");
             }
        }
        tank.setEmpty(false);
    }
}
