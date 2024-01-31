package org.evgenysav.module3.task3;

import java.util.Scanner;

public class TaskB {

    private String text;

    private void assignTextFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        text = scanner.nextLine();
    }

    public static String reverseString(String textToReverse) {
        byte[] bytes = textToReverse.getBytes();
        byte[] resultBytes = new byte[textToReverse.length()];
        int counter = 0;
        for (int i = bytes.length - 1; i >= 0; i--) {
            resultBytes[counter] = bytes[i];
            counter++;
        }
        return new String(resultBytes);
    }

    public String reverseString() {
        assignTextFromKeyboard();
        StringBuilder stringBuilder = new StringBuilder(text);
        return stringBuilder.reverse().toString();
    }
}
