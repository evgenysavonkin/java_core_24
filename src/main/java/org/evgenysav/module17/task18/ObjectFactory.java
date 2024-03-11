package org.evgenysav.module17.task18;

public class ObjectFactory {
    static <T> T create(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("Error while creating object: " + e.getMessage());
        }
    }
}
