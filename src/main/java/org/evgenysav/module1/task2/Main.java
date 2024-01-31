package org.evgenysav.module1.task2;

public class Main {
    public static void main(String[] args) {
        Integer integer = 5;
        Class<? extends Integer> integerClass = integer.getClass();
        System.out.println(integerClass.getClassLoader());
    }
}
