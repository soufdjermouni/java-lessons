package com.lessons.innerclass.exemple2;

public class OuterClassStatic {
    private int innerValueEnclosing ;
    private static class InnerClass {
        private int innerValue;

        public InnerClass(int value) {
            this.innerValue = value;
        }

        public void display() {
            System.out.println("Inner Value: " + innerValue);
           // System.out.println(innerValueEnclosing);//Non-static field 'innerValueEnclosing' cannot be referenced
            // from a static context
        }
    }

    public static void main(String[] args) {
        InnerClass inner = new InnerClass(42);
        inner.display();
    }
}
