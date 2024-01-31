package org.evgenysav.module3.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskBTest {

    @Test
    void reverse_string_manual_case_1() {
        String result = TaskB.reverseString("Hello world!");
        assertEquals("!dlrow olleH", result);
    }

    @Test
    void reverse_string_manual_case_2() {
        String result = TaskB.reverseString("Dear programmer!");
        assertEquals("!remmargorp raeD", result);
    }

    @Test
    void reverse_string_manual_case_3() {
        String result = TaskB.reverseString("How are you?");
        assertEquals("?uoy era woH", result);
    }

    @Test
    void reverse_string_manual_case_4() {
        String result = TaskB.reverseString("it's an easy task for you?");
        assertEquals("?uoy rof ksat ysae na s'ti", result);
    }
}