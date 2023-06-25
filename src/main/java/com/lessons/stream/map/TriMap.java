package com.lessons.stream.map;

import com.lessons.stream.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TriMap {

    public static void main(String[] args) {

        Map<Integer, Service> map = new HashMap<Integer, Service>();
        Service s1 = Service.builder()
                .name("proc2")
                .method("method2").build();
        Service s2 = Service.builder()
                .name("proc1")
                .method("method1").build();
        map.put(Integer.valueOf(2),s1);
        map.put(Integer.valueOf(1),s2);

        Map<Integer, Service> result = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        result.forEach((i, s) -> System.out.println(s.getName()));
    }
}
