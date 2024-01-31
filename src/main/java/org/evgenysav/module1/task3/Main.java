package org.evgenysav.module1.task3;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        ClassLoader classLoader = myClass.getClass().getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
}
