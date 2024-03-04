package org.evgenysav.module15.task15;

@FunctionalInterface
public interface Converter<T, N> {
    N convert(T t);

    static boolean isNotNull(Object t) {
        if (t != null) {
            return false;
        }

        return true;
    }

    default void writeToConsole(T t) {
        System.out.println(t);
    }
}
