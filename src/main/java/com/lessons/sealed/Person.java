package com.lessons.sealed;

/**
 * n this example, we've declared an abstract class named Person. We've also specified that the only classes
 * that can extend it are Employee and Manager
 * . Extending the sealed class is done just as it is today in Java, using the extends keyword:
 *
 * It's important to note that any class that extends a sealed class must itself be declared sealed,
 * non-sealed, or final.
 * This ensures the class hierarchy remains finite and known by the compiler
 */
public abstract sealed class Person permits Employee, Manager {
}
