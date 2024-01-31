package org.evgenysav.module3.task3;

public class TaskD {
    public static String getUppercaseLetters(String input) {
        StringBuilder resultBuilder = new StringBuilder();
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                resultBuilder.append(c);
            }
        }
        return resultBuilder.toString();
    }
}
