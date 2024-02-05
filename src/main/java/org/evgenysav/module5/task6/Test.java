package org.evgenysav.module5.task6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfStudents = scanner.nextInt();
        getStudentCredentials(scanner, countOfStudents);
        Student.calculateAverageScore();
    }

    private static void getStudentCredentials(Scanner scanner, int countOfStudents) {
        String firstName;
        String lastName;
        double avgScore;

        int counter = 0;
        while (counter < countOfStudents) {
            scanner.nextLine();
            lastName = scanner.nextLine();
            firstName = scanner.nextLine();
            avgScore = scanner.nextDouble();
            new Student(lastName, firstName, avgScore);
            counter++;
        }
    }
}
