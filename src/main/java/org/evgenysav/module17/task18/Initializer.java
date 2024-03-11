package org.evgenysav.module17.task18;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Initializer {
    static <T> T initialize(T target, String fieldName, Object value) {
        Method[] methods = target.getClass().getMethods();
        Method setter = null;
        for (Method method : methods) {
            String currMethodName = method.getName();
            if (currMethodName.startsWith("set")) {
                String lowerMethodName = currMethodName.toLowerCase();
                if (lowerMethodName.equals("set" + fieldName.toLowerCase())) {
                    setter = method;
                }
            }
        }
        if (setter == null) {
            throw new RuntimeException("Doesn't match any setter");
        }
        try {
            setter.invoke(target, value);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException("Error while initializing object: " + e.getMessage());
        }

        return target;
    }
}
