package org.evgenysav.module6.task7;

public class StackOverflowErrorExamples {

    public static void example(int x) {
        example(2 * x);
    }

    public static void example2() {
        while (true) {
            example2();
        }
    }

    public static void main(String[] args) {
        example(5);
    }
}
