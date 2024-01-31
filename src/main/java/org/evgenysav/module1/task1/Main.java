package org.evgenysav.module1.task1;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Class<? extends Main> mainClass = main.getClass();
        ClassLoader classLoader = mainClass.getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
}
