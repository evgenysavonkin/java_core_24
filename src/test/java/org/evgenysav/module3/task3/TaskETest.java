package org.evgenysav.module3.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskETest {

    @Test
    void get_even_uppercase_letters_case_1() {
        String result = TaskE.getEvenUppercaseLetters("ahahahah");
        assertEquals("HHHH", result);
    }

    @Test
    void get_even_uppercase_letters_case_2() {
        String result = TaskE.getEvenUppercaseLetters("hello");
        assertEquals("EL", result);
    }

    @Test
    void get_even_uppercase_letters_case_3() {
        String result = TaskE.getEvenUppercaseLetters("Friends");
        assertEquals("RED", result);
    }

    @Test
    void get_even_uppercase_letters_case_4() {
        String result = TaskE.getEvenUppercaseLetters("Wow");
        assertEquals("O", result);
    }
}