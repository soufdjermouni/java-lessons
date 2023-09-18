package com.interview.memory;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeakFixed {

    private static List<String> data = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            data.add("This is a sample string to simulate a memory leak" +
                    "visualvm --jdkhome \"C:\\developpement\\java\\jdk-17.0.4.1\"" +
                    "visualvm --jdkhome \"C:\\developpement\\java\\jdk-17.0.4.1\"" +
                    "visualvm --jdkhome \"C:\\developpement\\java\\jdk-17.0.4.1\"" +
                    "visualvm --jdkhome \"C:\\developpement\\java\\jdk-17.0.4.1\"" +
                    "visualvm --jdkhome \"C:\\developpement\\java\\jdk-17.0.4.1\"" +
                    "This is a sample string to simulate a memory leak" +
                    "This is a sample string to simulate a memory leak" +
                    "This is a sample string to simulate a memory leak" +
                    "This is a sample string to simulate a memory leakThis is a sample string to simulate a memory leakThis is a sample string to simulate a memory leakThis is a sample string to simulate a memory leak" +
                    "This is a sample string to simulate a memory leak" +
                    "This is a sample string to simulate a memory leak" +
                    "This is a sample string to simulate a memory leak" +
                    "This is a sample string to simulate a memory leak" +
                    "This is a sample string to simulate a memory leak" +
                    "This is a sample string to simulate a memory leak" +
                    "This is a sample string to simulate a memory leak");
            System.out.println("Current list size: " + data.size());

            // Check list size and remove elements when it's too large
            if (data.size() > 1000) {
                data.subList(0, 500).clear(); // Remove the first 500 elements
                System.out.println("Cleared 500 elements.");
            }

            // Simulate some other work
            try {
                Thread.sleep(10); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
