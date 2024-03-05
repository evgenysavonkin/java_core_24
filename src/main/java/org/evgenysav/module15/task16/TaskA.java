package org.evgenysav.module15.task16;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TaskA {
    private static final List<String> strings = List.of("a1", "a2", "a3", "a1");

    public static void main(String[] args) {
//        System.out.println(getNumberOfOccurrences(strings, "a1"));
//        System.out.println(getFirstElement(strings));
//        System.out.println(getThirdElement(strings));
//        Arrays.stream(getTwoElementsFromSecondPos(strings)).forEach(e -> System.out.print(e + " "));
//        String[] strings = getElementsByTemplate(TaskA.strings, "a1"::equals);
//        System.out.println(Arrays.toString(strings));
//        System.out.println(isOneElementInCollection(strings, "a1"));
//        System.out.println(noElementsByKey(strings, "a7"));
//        System.out.println(Arrays.toString(removeFirstCharacterAndGetIntArr(strings)));
        List<String> sorted = sortCollection(strings);
        sorted.forEach(System.out::println);
    }

    private static long getNumberOfOccurrences(List<String> list, String key) {
        return list.stream()
                .filter(key::equals)
                .count();
    }

    private static String getFirstElement(List<String> list) {
        return list.stream()
                .findFirst()
                .orElse("0");
    }

    private static String getThirdElement(List<String> list) {
        return list.stream()
                .skip(2)
                .findFirst()
                .orElse("0");
    }

    private static String[] getTwoElementsFromSecondPos(List<String> list) {
        return list.stream()
                .skip(1)
                .limit(2)
                .toList()
                .toArray(new String[0]);
    }

    private static String[] getElementsByTemplate(List<String> list, Predicate<String> template) {
        return list.stream()
                .filter(template)
                .toList()
                .toArray(new String[0]);
    }

    private static boolean isOneElementInCollection(List<String> list, String key) {
        return list.stream()
                .filter(key::equals)
                .findAny()
                .stream()
                .count() >= 1;
    }

    private static boolean noElementsByKey(List<String> list, String key) {
        return list.stream()
                .noneMatch(key::equals);
    }

    private static Integer[] removeFirstCharacterAndGetIntArr(List<String> list) {
        return list.stream()
                .map(e -> e.substring(1))
                .map(Integer::parseInt)
                .toList()
                .toArray(new Integer[0]);
    }

    private static String getMergedLineFromCollection(List<String> list) {
        return list.stream()
                .collect(Collectors.joining());
    }

    private static List<String> sortCollection(List<String> list) {
        return list.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
