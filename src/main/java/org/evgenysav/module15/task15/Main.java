package org.evgenysav.module15.task15;

import org.evgenysav.module11.task11.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5).filter(i -> i % 2 == 0).forEach(System.out::println);
        Stream.of("Evgeny").forEach(s -> System.out.println("Hello, " + s));
        List<String> list = List.of("Elena", "John", "Alex", "Jim", "Sara");
        Stream.of(list).map(e -> {
            int randomNumber = new Random().nextInt(list.size());
            System.out.println(list.get(randomNumber));
            return list.get(randomNumber);
        }).collect(Collectors.toList());
        List<String> list1 = List.of("1", "2", "3", "4", "5");
        list1.stream().map(Integer::parseInt).forEach(System.out::println);
        list1.forEach(e -> {
            int i = Integer.parseInt(e);
            System.out.println(i * i);
        });
        list1.stream().map(e -> (int) Math.pow(Integer.parseInt(e), 2)).forEach(System.out::println);


    }

    private static Comparator<Person> getAdditionalPersonComparator() {
        return Person::compareTo;
    }

    private static <T> T[] filter(T[] arr, Filter<T> filter) {
        List<T> list = Stream.of(arr).filter(filter::apply).map(e -> e = null).toList();
        return list.toArray(arr);
    }

    private static <T> T[] fill(T[] arr, Function<T, T> consumer) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (T) (Integer) (i + 1);
        }

        return Stream.of(arr).map(e -> consumer.apply(e)).toList().toArray(arr);
    }
}
