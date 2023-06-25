package com.interview.list;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapFromList {
    public static void main(String[] args) throws Exception {

        // *flatMap* flatten the list of lists into a single list of strings : [mylist1, mylist2]
        withFlatMap();

        List<String> list= lists.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(list);
    }

    static List<List<String>> lists = List.of(
            List.of("mylist1", "mylist2")
    );

    public static void withFlatMap() throws Exception {
        List<String> collectLists = lists.stream()
                .flatMap(List::stream)
                .toList();
        //[mylist1, mylist2]
        System.out.println(collectLists);

    }

}
