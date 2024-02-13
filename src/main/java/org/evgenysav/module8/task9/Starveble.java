package org.evgenysav.module8.task9;

public interface Starveble {
    default void isHungry() {
        System.out.println("not hungry");
    }
}
