package org.evgenysav.module17.task18;

public class Test {
    public static void main(String[] args) {
        Apple apple = ObjectFactory.create(Apple.class);
        initializeAndPrint(apple, false);
    }

    private static void initializeAndPrint(Apple apple, boolean isBadInitializer) {
        if (isBadInitializer) {
            BadInitializer.initialize(apple, "weight", 10.3);
            BadInitializer.initialize(apple, "color", "Blue");
        } else {
            Initializer.initialize(apple, "weight", 10.3);
            Initializer.initialize(apple, "color", "Blue");
        }

        System.out.println(apple);
    }
}
