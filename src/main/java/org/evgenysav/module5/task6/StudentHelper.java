package org.evgenysav.module5.task6;

import java.util.ArrayList;
import java.util.List;

public class StudentHelper {

    private static final StudentHelper INSTANCE = new StudentHelper();
    private static final List<Student> students;

    static {
        students = new ArrayList<>();
    }

    public static void addStudent(Student student){
        students.add(student);
    }

    private StudentHelper(){

    }

    public StudentHelper getInstance(){
        return INSTANCE;
    }

    public static void calculateAverageScore() {
        double avg = students.stream().mapToDouble(Student::getAverageScore).average().orElse(-1);
        System.out.println(avg);
        printStudentBelowAvgScore(avg);
    }

    private static void printStudentBelowAvgScore(double averageScore) {
        students.stream().filter(s -> s.getAverageScore() < averageScore).forEach(System.out::println);
    }


}
