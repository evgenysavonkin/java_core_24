package org.evgenysav.module8.task9;

public interface Voiceable {
    default void voice() {
        System.out.println("voice");
    }
}
