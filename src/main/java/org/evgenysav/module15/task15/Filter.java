package org.evgenysav.module15.task15;

@FunctionalInterface
public interface Filter<T> {
    boolean apply(T t);
}
