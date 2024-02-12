package org.evgenysav.module5.task6;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String firstName;
    private final String lastName;
    private double averageScore;
    private static int counter;

    public Student(String lastName, String firstName, double averageScore) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.averageScore = averageScore;
        addStudent();
        counter++;
        System.out.println("Default constructor execution - " + counter);
    }

    private void addStudent() {
        StudentHelper.addStudent(this);
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
