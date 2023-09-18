package com.interview.thread.watertank;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainCheckMonitor {

    public static void main(String[] args) {
        WaterTank tank = new WaterTank(100); // Create a water tank with a capacity of 100 liters
        WaterTankMonitor monitor = new WaterTankMonitor(tank);

        checkMonitor(monitor, tank, 4, 500);

        System.out.println("Final water level: " + tank.getCurrentWaterLevel() + " liters");
    }

    private static void checkMonitor(WaterTankMonitor monitor, WaterTank tank, int numThreads, int numOperations) {
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        for (int i = 0; i < numThreads; i++) {
            executor.execute(() -> {
                for (int j = 0; j < numOperations; j++) {
                    if (j % 2 == 0) {
                        monitor.empty();
                    } else {
                        monitor.fill();
                    }
                }
            });
        }

        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
