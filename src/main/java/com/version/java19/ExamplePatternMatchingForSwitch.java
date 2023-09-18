package com.version.java19;

public class ExamplePatternMatchingForSwitch {

    public static void main(String[] args) {
        System.out.println(formatter("Java 17"));
        System.out.println(formatter(17));


    }

  /** Patterns in switch are not supported at language level '17'*/
  /*static String formatterNEw(Object o) {
        return switch (o) {
           case Integer i ->  String.format("int %d", i);;
            case Float f -> String.format("double %f", f);
            case String s -> String.format("String %s", s);
            default -> 0d;
        };
    }*/

    //JAVA Old
    static String formatter(Object o) {
        String formatted = "unknown";
        if (o instanceof Integer i) {
            formatted = String.format("int %d", i);
        } else if (o instanceof Long l) {
            formatted = String.format("long %d", l);
        } else if (o instanceof Double d) {
            formatted = String.format("double %f", d);
        } else if (o instanceof String s) {
            formatted = String.format("String %s", s);
        }
        return formatted;
    }
}
