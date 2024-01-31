package org.evgenysav.module3.task3;

import java.util.Scanner;

public class TaskC {

    private String text;

    private void assignTextFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        text = scanner.nextLine();
    }

    public static String deleteAllSpacesFromString(String textToDeleteSpaces) {
        StringBuilder resultBuilder = new StringBuilder();
        char[] chars = textToDeleteSpaces.toCharArray();
        for (char c : chars) {
            if (c != ' '){
                resultBuilder.append(c);
            }
        }
        return resultBuilder.toString();
    }

    public String deleteAllSpacesFromString() {
        assignTextFromKeyboard();
        StringBuilder resultBuilder = new StringBuilder();
        char[] chars = text.toCharArray();
        for (char c : chars) {
            if (c != ' '){
                resultBuilder.append(c);
            }
        }
        return resultBuilder.toString();
    }
}
