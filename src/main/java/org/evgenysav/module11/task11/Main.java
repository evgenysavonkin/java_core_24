package org.evgenysav.module11.task11;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[]{new Person("Bob1", 5), new Person("Bob1", 8),
                new Person("Bob2", 15), new Person("Bob2", 7),
                new Person("Bob5", 7)};
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(people));
        System.out.println("Sorting by using Comparable<Person>:");
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
        System.out.println("Sorting by using anonymous Comparator:");
        Arrays.sort(people, Comparator
                .comparing(Person::getAge)
                .thenComparing(Person::getName));
        System.out.println(Arrays.toString(people));
    }
}
