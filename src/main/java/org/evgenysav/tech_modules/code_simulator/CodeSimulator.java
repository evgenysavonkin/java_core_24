package org.evgenysav.tech_modules.code_simulator;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class CodeSimulator {
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static boolean isPrime(int n) {
        int divider = 2;
        while (divider < Math.sqrt(n)) {
            if (n % divider == 0) {
                return false;
            }

            divider++;
        }

        return true;
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static double fibonacci(int index) {
        double result;
        double firstNumber = 0;
        double secondNumber = 1;
        if (index == 0) {
            return 0;
        }
        int counter = 0;
        while (counter <= index) {
            if (counter < 2) {
                counter++;
                continue;
            }

            result = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = result;
            counter++;
        }

        return secondNumber;
    }

    public static int[] swap(int x, int y) {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        return new int[]{x, y};
    }

    public static void printMatrix() {
        int result;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                result = i * j;
                if (String.valueOf(result).length() == 2) {
                    System.out.print(result + "   ");
                    continue;
                }
                System.out.print((i * j) + "    ");
            }
            System.out.println();
        }
    }

    public static boolean uniqueCharacters(String text) {
        char[] charArray = text.toCharArray();
        Set<Character> set = new HashSet<>();
        IntStream.range(0, charArray.length)
                .mapToObj(i -> charArray[i])
                .forEach(set::add);
        return set.size() == charArray.length;
    }

    public static boolean equals(String str1, String str2) {
        return str1.equals(str2);
    }
}
