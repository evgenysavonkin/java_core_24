package org.evgenysav.module3.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskDTest {

    @Test
    void get_uppercase_letters_case_1() {
        String result = TaskD.getUppercaseLetters("hhh Y m OooO");
        assertEquals("YOO", result);
    }

    @Test
    void get_uppercase_letters_case_2() {
        String result = TaskD.getUppercaseLetters("HellO FrienD");
        assertEquals("HOFD", result);
    }

    @Test
    void get_uppercase_letters_case_3() {
        String result = TaskD.getUppercaseLetters("YoU NEveR Be ALONe");
        assertEquals("YUNERBALON", result);
    }

    @Test
    void get_uppercase_letters_case_4() {
        String result = TaskD.getUppercaseLetters("New Year Tree");
        assertEquals("NYT", result);
    }
}