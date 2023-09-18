package com.interview.memory.map;

import java.util.HashMap;
import java.util.Map;

public class MemoryMapLeakExample {

    private static Map<String, String> cache = new HashMap<>();

    public static void main(String[] args) {
        //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        for (int i = 0; i < 1000000000; i++) {
            String key = "Key" + i;
            String value = "Value" + i;
            cache.put(key, value);
        }

        System.out.println("Cache size: " + cache.size());

        // Simulate the program running indefinitely
        while (true) {
            // Perform some other work or wait
        }
    }
}
