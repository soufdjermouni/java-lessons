package com.lessons.bases;

public class ExampleHashCode {

    public static void main(String[] args) {

        Person person1 = new Person("John", 30);
        Person person2 = new Person("John", 30);
        System.out.println(person1.equals(person2)); // false,car equals n'est pas surchargé

        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1.equals(str2)); // true, Dans le cas des objets String en Java, la méthode equals() est
        // redéfinie dans la classe String pour comparer le contenu des chaînes de caractères, plutôt que de se fier
        // à la comparaison de références mémoire.

    }
}

class Person {
    private String name;
    private int age;

    // constructeur
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // redéfinition de la méthode hashCode
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        return result;
    }

    // autres méthodes de la classe
    // ...
}




