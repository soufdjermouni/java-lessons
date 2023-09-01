package com.paradigme.solid.isp;

//ISP : Interface segregation principle
//ISP: Only inherit applicable methods

/**
 * In this example, the Animal interface specifies three methods: makeSound(), eat(). However, not all
 * animals can perform all of these actions. For example, birds can fly, but cats and dogs cannot.
 *
 * The Interface Segregation Principle states that we should not force an object to implement methods that it does not
 * use. In this case, we could violate the ISP by forcing the Cat and Dog classes to implement the fly() method,
 * even though they cannot fly.
 *
 * To avoid violating the ISP, we can split the Animal interface into three smaller interfaces: Soundable, Edible,
 * The Soundable interface specifies the makeSound() method, the Edible interface specifies the eat() method,
 * and the Flyable interface specifies the fly() method.
 *
 * The Cat and Dog classes can then implement the Soundable and Edible interfaces, while the Bird class can implement
 * the Soundable, Edible, and Flyable interfaces. This ensures that no object is forced to implement methods that it does not use.
 *
 */

