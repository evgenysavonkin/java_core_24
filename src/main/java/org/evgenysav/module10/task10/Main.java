package org.evgenysav.module10.task10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    private static final String FILE_PATH = "./input.txt";
    private static final String INCORRECT_FILE_PATH = "./input1.txt";

    private static void readFile(String path) {
        File file = new File(path);
        try (
                FileInputStream fileInputStream = new FileInputStream(file);
                Scanner scanner = new Scanner(fileInputStream)) {
            String fileLine = scanner.nextLine();
            System.out.printf("'%s' read from file", fileLine);
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFound exception for '" + path + "'");
        } catch (IOException e) {
            System.err.println("I/O exception for '" + path + "'");
        }
    }

    private static void readFileWithThrowing(String path) {
        File file = new File(path);
        try (
                FileInputStream fileInputStream = new FileInputStream(file);
                Scanner scanner = new Scanner(fileInputStream)) {
            String fileLine = null;
            try {
                fileLine = scanner.nextLine();
                System.out.printf("'%s' read from file", fileLine);
            } catch (NoSuchElementException e) {
                throw new EmptyFileException("The file is empty", e, path);
            }
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFound exception for '" + path + "'");
        } catch (EmptyFileException ignored) {

        } catch (IOException e) {
            System.err.println("I/O exception for '" + path + "'");
        }
    }

    public static void main(String[] args) {
        readFileWithThrowing(FILE_PATH);
    }
}
