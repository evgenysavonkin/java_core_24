package org.evgenysav.module3.task3;

public class TaskJ {
    private static final String STR1 = "Java";
    private static final String STR2 = "JAVA";
    private static final String STR3 = "C#";
    private static final String STR4 = "Java";

    public static void equalsStringFirstCase() {
        System.out.println(STR1.equals(STR2));
        System.out.println(STR1.equals(STR3));
        System.out.println(STR1.equals(STR4));
        System.out.println(STR2.equals(STR3));
        System.out.println(STR2.equals(STR4));
        System.out.println(STR3.equals(STR4));
    }

    public static void equalsStringSecondCase() {
        System.out.println(STR1.equalsIgnoreCase(STR2));
    }

    public static void equalsStringThirdCase() {
        System.out.println(STR1 == STR4);
    }
    public static void equalsStringFourthCase() {
        String str1 = "JavaJava";
        System.out.println(str1.substring(4) == STR4);
    }
    public static void equalsStringFifthCase() {
        System.out.println(STR1 == null);
    }
    public static void equalsStringSixCase() {
        String str1 = null;
        System.out.println(str1 == null);
    }

    public static void main(String[] args) {
        equalsStringFirstCase();
        equalsStringSecondCase();
        equalsStringThirdCase();
        equalsStringFourthCase();
        equalsStringFifthCase();
        equalsStringSixCase();
    }
}
