package org.evgenysav.module11.task11;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return Comparator
                .comparing(Person::getName)
                .thenComparing(Person::getAge)
                .compare(this, o);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }
}
