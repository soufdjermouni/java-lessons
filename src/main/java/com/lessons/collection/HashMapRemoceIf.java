package com.lessons.collection;

import java.util.HashMap;

public class HashMapRemoceIf {

    public static void main(String[] args) {

        HashMap<Integer, Integer> testMap = new HashMap<>();
        testMap.put(1, 1);
        testMap.put(2, 20);

        testMap.entrySet().removeIf(e -> e.getValue() <10);
        testMap.keySet().stream().forEach(el -> System.out.println(el));
        testMap.entrySet().stream().forEach(e-> System.out.println(e));



    }
}
