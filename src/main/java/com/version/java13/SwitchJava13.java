package com.version.java13;

public class SwitchJava13 {

    public static void main(String[] args) {
        System.out.println(getValueViaYield("b"));

        System.out.println(getValueViaArrow("b"));
    }

    // Java 13, switch expression returns a value via yield
    private static int getValueViaYield(String mode) {
        int result = switch (mode) {
            case "a", "b":
                yield 1;
            case "c":
                yield 2;
            case "d", "e", "f":
                // do something here...
                System.out.println("Supports multi line block!");
                yield 3;
            default:
                yield -1;
        };
        return result;
    }

    // Java 12, switch expression returns a value via label rules (arrow)
    private static int getValueViaArrow(String mode) {
        int result = switch (mode) {
            case "a", "b" -> 1;
            case "c" -> 2;
            case "d", "e", "f" -> {
                // do something here...
                System.out.println("Supports multi line block!");
                yield 3;
            }
            default -> {
                yield -1;
            }
        };
        return result;
    }
}
