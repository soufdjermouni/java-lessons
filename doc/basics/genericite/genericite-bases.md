# Tableaux
>T[] elements = new T[5]; 

On aura une erreur : `Type parameter 'T' cannot be instantiated directly ` 
Specifically, arrays store and check type information at runtime

# Wild card   
a wildcard is a special character used as a placeholder to represent unknown types in generic classes, methods, or 
interfaces. Wildcards provide flexibility when working with generic types, allowing you to work with a range 
of related types without specifying the exact type. The wildcard character is ?.

There are three main types of wildcards in Java:

- `Unbounded Wildcard` (?): It allows you to accept any type of argument without specifying the exact type.
- `Upper Bounded Wildcard` (? extends T): An upper bounded wildcard allows you to specify that the type is a 
subclass of a given type T.
  For example, List<? extends Number> can accept lists of Integer, Double, 
  or other types that are subclasses of Number
- `Lower Bounded Wildcard` (? super T): A lower bounded wildcard allows you to specify that the type is a superclass of
a given type T.  
For example, List<? super Integer> can accept lists of Number, Object, or other types that are superclasses of Integer.


```java
public class GenericExample {
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Hello", "World");
        List<Integer> integerList = Arrays.asList(1, 2, 3);

        printList(stringList); // Accepts List of any type
        printList(integerList); // Accepts List of any type
    }
}
```
