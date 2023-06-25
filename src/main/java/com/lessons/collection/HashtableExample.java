package com.lessons.collection;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashtableExample {

    public static void main(String[] args) {
        Hashtable<Integer,String> mymap=new Hashtable<Integer,String>();
        mymap.put(100,"Amit");
        mymap.put(102,"Ravi");
        mymap.put(101,"Vijay");
        mymap.put(103,"Rahul");

        for (Map.Entry<Integer,String> entry:mymap.entrySet()) {
            System.out.println(entry.getValue());
        }

        //hshMap to list
        System.out.println("---------------");
        List<String > list = mymap.keySet().stream().map(e ->mymap.get(e)).collect(Collectors.toList());
        list.stream().forEach(System.out::println);
    }
}
