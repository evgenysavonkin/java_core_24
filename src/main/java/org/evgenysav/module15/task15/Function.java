package org.evgenysav.module15.task15;

@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
