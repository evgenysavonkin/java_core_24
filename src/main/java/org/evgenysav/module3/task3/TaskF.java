package org.evgenysav.module3.task3;

import java.util.Scanner;

public class TaskF {
    public static String[] getReplacedEmptyStringsArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of strings: ");
        int numberOfStrings = scanner.nextInt();

        String[] strings = new String[numberOfStrings];
        int counter = 0;
        boolean zeroFlag = true;
        while (counter < numberOfStrings) {
            if (zeroFlag) {
                scanner.nextLine();
                zeroFlag = false;
            } else {
                strings[counter] = scanner.nextLine();
                counter++;
            }
        }

        String[] resultArr = new String[numberOfStrings];
        for (int i = 0; i < numberOfStrings; i++) {
            resultArr[i] = (strings[i] != null && strings[i].isEmpty()) ? "String is empty" : strings[i];
        }

        return resultArr;
    }

    public static String[] getReplacedEmptyStringsArray(int number, String[] strings) {
        String[] resultArr = new String[number];
        for (int i = 0; i < number; i++) {
            resultArr[i] = (strings[i] != null && strings[i].isEmpty()) ? "String is empty" : strings[i];
        }

        return resultArr;
    }
}
