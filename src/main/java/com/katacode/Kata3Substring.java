package com.katacode;

public class Kata3Substring {

    public static void main(String[] args) {
        String one = "abcd";
        String two = "abc";
        System.out.println("Taille tab = "+ one.length());
        String three = one.substring(0,one.length());
        String four = one.substring(0,one.length()-1);
        System.out.println("four="+four);

        /**
         * In Java, when you use the `==` operator to compare two objects, it checks if they are the same
         * object in memory.
         *
         *  1- (one == three)
         * The variable `three` is assigned the value of `one.substring(0, one.length())`, which is equivalent
         * to `one`  (substring return this) . Therefore, `one` and `three` are pointing to the same object in memory. Hence, `(one == three)`
         * returns `true`.
         *
         * 2- (two == four)
         * The variable `two` is a `String` object that contains the value `"abc"`.
         *
         * The variable `four` is assigned the value of `one.substring(0, one.length()-1)`, which is equivalent to
         * `"abc"`. However, `two` and `four` are not the same objects in memory, as they have different string values.
         * Therefore, `(two == four)` returns `false`
         * *
         */
        System.out.print((one == three) +"-"+ (two == four)); //true-false
    }

    /**
     * public String substring(int beginIndex, int endIndex) {
     *         int length = length();
     *         checkBoundsBeginEnd(beginIndex, endIndex, length);
     *         if (beginIndex == 0 && endIndex == length) {
     *             return this;
     *         }
     */
}
