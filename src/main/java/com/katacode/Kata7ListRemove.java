package com.katacode;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Kata7ListRemove {

    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Bat", "Cat","Orange");
        List<String> wordsAL = new ArrayList<>(words);
        for (int i=0;i< wordsAL.size();i++) {
            System.out.println(wordsAL.get(i));
            if(wordsAL.get(i).endsWith("at")){
                wordsAL.remove(wordsAL.get(i));
            }
        }
        System.out.println("#########"+wordsAL);

        List<String> wordsAL2 = new ArrayList<>(words);
        ListIterator<String> wordsALIterator = wordsAL2.listIterator();
        while (wordsALIterator.hasNext()){
            System.out.println(wordsALIterator.next());
        }
    }
}
