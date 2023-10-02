package com.interview.algorithm.race;

public class MainAnimal {
    public static void main(String[] args) {

        Animal dog = new Dog("Sammy");
        Animal cat = new Dog("smokey");
        System.out.println(dog.getName());
        System.out.println(MainAnimal.getAnimalName(dog));

        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Sammy");
        animals[1] = new Cat("smokey");
    }

    static String getAnimalName(Animal a) {
        String name = null;
       /** if(a instanceof Dog) {
            name = a.getName();
        } else if(a instanceof Cat){
            name = a.getName();
        }    */
        return a.getName();
    }
}
