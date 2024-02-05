package org.evgenysav.module5.task6;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String firstName;
    private final String lastName;
    private double averageScore;
    private static int counter;
    private static final List<Student> students;

    static {
        students = new ArrayList<>();
    }

    public Student(String lastName, String firstName, double averageScore) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.averageScore = averageScore;
        addStudent();
        counter++;
        System.out.println("Default constructor execution - " + counter);
    }

    private void addStudent() {
        students.add(this);
    }

    protected static void calculateAverageScore() {
        double avg = students.stream().mapToDouble(Student::getAverageScore).average().orElse(-1);
        System.out.println(avg);
        printStudentBelowAvgScore(avg);
    }

    private static void printStudentBelowAvgScore(double averageScore) {
        students.stream().filter(s -> s.getAverageScore() < averageScore).forEach(System.out::println);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + averageScore;
    }
}
