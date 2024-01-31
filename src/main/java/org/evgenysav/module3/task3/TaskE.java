package org.evgenysav.module3.task3;

public class TaskE {
    public static String getEvenUppercaseLetters(String text) {
        StringBuilder resultBuilder = new StringBuilder();
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 1){
                resultBuilder.append(Character.toUpperCase(chars[i]));
            }
        }
        return resultBuilder.toString();
    }
}
