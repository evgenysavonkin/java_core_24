package org.evgenysav.module15.task16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TaskB {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("Basil", 16, Sex.MAN), new Person("Peter", 23, Sex.MAN),
                new Person("Helen", 42, Sex.WOMAN), new Person("Ivan", 69, Sex.MAN));
        findLiablePersonForMilitary(personList).forEach(System.out::println);
        System.out.println(getAverageMenAge(personList));
        System.out.println(getAbleBodiedNumber(personList));
        System.out.println(getPersonWithMinAge(personList));
        System.out.println(sortPeople(personList));
    }

    private static List<Person> findLiablePersonForMilitary(List<Person> list) {
        return list.stream()
                .filter(p -> p.getAge() > 18)
                .filter(p -> p.getAge() < 27)
                .toList();
    }

    private static int getAverageMenAge(List<Person> list) {
        return (int) list.stream()
                .filter(p -> p.getSex() == Sex.MAN)
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();
    }

    private static long getAbleBodiedNumber(List<Person> list) {
        long womenCount = list
                .stream()
                .filter(p -> p.getAge() >= 18 && p.getAge() <= 55)
                .filter(p -> p.getSex() == Sex.WOMAN)
                .count();

        long menCount = list
                .stream()
                .filter(p -> p.getAge() >= 18 && p.getAge() <= 60)
                .filter(p -> p.getSex() == Sex.MAN)
                .count();

        return womenCount + menCount;
    }

    private static Person getPersonWithMinAge(List<Person> list) {
        return list.stream()
                .sorted(Comparator
                        .comparing(Person::getAge))
                .findFirst()
                .orElse(new Person());
    }

    private static List<Person> sortPeople(List<Person> list) {
        return list.stream()
                .sorted(Comparator
                        .comparing((Person p) -> p.getSex() == Sex.WOMAN)
                        .thenComparing(Person::getAge))
                .toList();
    }
}
