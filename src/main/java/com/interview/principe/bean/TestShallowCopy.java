package com.interview.principe.bean;

public class TestShallowCopy {

    public static void main(String[] args) {

        Address address = new Address("Downing St 10", "London", "England");
        User pm = new User("Prime", "Minister", address);

        User shallowCopy = new User(
                pm.getFirstName(), pm.getLastName(), pm.getAddress());
        System.out.println(shallowCopy.equals(pm));//false


        //In this case, pm != shallowCopy, which means that they're different objects; however, the problem is that when
        // we change any of the original address' properties, this will also affect the shallowCopy‘s address.
        address.setCountry("Great Britain");
        System.out.println(shallowCopy.getAddress().getCountry().equals(pm.getAddress().getCountry()));//true


        //5. Deep Copy A deep copy is an alternative that solves this problem. Its advantage is that each mutable object
        // in the object graph is recursively copied.



    }
}
