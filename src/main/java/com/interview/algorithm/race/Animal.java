package com.interview.algorithm.race;

import lombok.Getter;

@Getter
abstract class Animal {
    protected String name;
    Animal(String name){
        this.name = name;
    }
}
