package org.evgenysav.module17.task18;

import java.lang.reflect.Field;

public class BadInitializer extends Initializer {

    static <T> T initialize(T target, String fieldName, Object value) {
        Class<?> clazz = target.getClass();
        Field field = null;
        try {
            field = clazz.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e.getMessage());
        }
        field.setAccessible(true);

        try {
            field.set(target, value);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e.getMessage());
        }

        return target;
    }
}
