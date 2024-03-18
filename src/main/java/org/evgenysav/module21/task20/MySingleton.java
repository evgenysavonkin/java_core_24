package org.evgenysav.module21.task20;

import java.util.Objects;

public class MySingleton {
    private int firstValue;
    private int secondValue;
    private int thirdValue;

    private MySingleton() {
        firstValue = 1;
        secondValue = 2;
        thirdValue = 3;
    }

    private static class MySingletonHolder{
        private static final MySingleton INSTANCE = new MySingleton();
    }

    public static MySingleton getInstance() {
        return MySingletonHolder.INSTANCE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MySingleton that = (MySingleton) o;
        return firstValue == that.firstValue && secondValue == that.secondValue && thirdValue == that.thirdValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstValue, secondValue, thirdValue);
    }

    @Override
    public String toString() {
        return "MySingleton{" +
                "firstValue=" + firstValue +
                ", secondValue=" + secondValue +
                ", thirdValue=" + thirdValue +
                ", hashcode=" + hashCode() +
                '}';
    }
}
