package com.interview.principe;

import com.lessons.polymorphism.constructor.Person;

import java.util.LinkedList;

public class DeepCopyLinkedList {

    public static void main(String[] args) {

        LinkedList<Person> originalList = new LinkedList<>();
        Person john = new Person("John", "Smith");
        Person jane = new Person("Jane", "Doe", 25);
        originalList.add(john);
        originalList.add(jane);

        LinkedList<Person> copyList =  deepCopyLinkedList(originalList);
        for (Person person :copyList ) {
            System.out.println(person.getName());
        }

        System.out.println(originalList);
        System.out.println(copyList);
    }

    public static LinkedList<Person> deepCopyLinkedList(LinkedList<Person> original) {
        LinkedList<Person> copy = new LinkedList<>();
        for (Person person : original) {
            Person personCopy = new Person(person.getName(), person.getAge());
            copy.add(personCopy);
        }
        return copy;
    }


}
