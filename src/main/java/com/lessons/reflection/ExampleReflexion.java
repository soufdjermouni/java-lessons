package com.lessons.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ExampleReflexion {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException {
        Foo foo = new Foo("toto");
        foo.hello();

        // En utilisant la réflexion
        Class<?> cl = Class.forName("com.lessons.reflection.Foo");
        // Instanciation de l'objet dont la méthode est à appeler
        Class[] cArg = new Class[1];
        cArg[0] = String.class;
        Object instance = cl.getDeclaredConstructor(cArg).newInstance("toto");
        // Invocation de la méthode via réflexion
        Method method = cl.getClass().getDeclaredMethod("hello", cArg);
        method.invoke(instance);
    }
}
