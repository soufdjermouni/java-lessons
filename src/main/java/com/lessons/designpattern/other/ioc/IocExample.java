package com.lessons.designpattern.other.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//l existe différentes formes, ou représentation d'IoC, le plus connu étant l'injection de dépendances
// (dependency injection) qui est un patron de conception permettant, en programmation orientée objet, de
// découpler les dépendances entre objets.
// Le principe est de découpler les liens de dépendances entre objets. Ainsi les dépendances entre composants logiciels
// ne sont plus exprimées dans le code de manière statique mais déterminées dynamiquement à l'exécution.
public class IocExample {

    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    }
}
