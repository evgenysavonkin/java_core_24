package org.evgenysav.module8.task9;

public interface Movable {
    default void move() {
        System.out.println("movement");
    }
}
