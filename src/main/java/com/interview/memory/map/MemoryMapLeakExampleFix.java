package com.interview.memory.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MemoryMapLeakExampleFix {

    private static final int MAX_CACHE_SIZE = 1000;
    private static Map<String, String> cache = new LinkedHashMap<String,String>(MAX_CACHE_SIZE, 0.75f, true){
        @Override
        protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
            return size() > MAX_CACHE_SIZE;
        }
    };

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
