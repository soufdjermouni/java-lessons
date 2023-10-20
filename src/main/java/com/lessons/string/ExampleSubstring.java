package com.lessons.string;

/**
 * Final Takeaways on Using the Java String Substring Method
 * The start index for both versions is inclusive, which means it includes the character in that index location.
 * 3The
 * end index is non-inclusive and as such does not include the character at that index location.
 */
public class ExampleSubstring {
    public static void main(String[] args) {

        String fruit = "strawberries";
        System.out.println(fruit.substring(2,5));//raw
    }
}
