package org.evgenysav.module3.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskCTest {

    @Test
    void delete_all_spaces_from_string_case_1() {
        String result = TaskC.deleteAllSpacesFromString("Hello, user! How are you? Fine!");
        assertEquals("Hello,user!Howareyou?Fine!", result);
    }

    @Test
    void delete_all_spaces_from_string_case_2() {
        String result = TaskC.deleteAllSpacesFromString("To be or not to be, that is the question.");
        assertEquals("Tobeornottobe,thatisthequestion.", result);
    }

    @Test
    void delete_all_spaces_from_string_case_3() {
        String result = TaskC.deleteAllSpacesFromString("I love cats and programming");
        assertEquals("Ilovecatsandprogramming", result);
    }

    @Test
    void delete_all_spaces_from_string_case_4() {
        String result = TaskC.deleteAllSpacesFromString("You don't forget someone you loved");
        assertEquals("Youdon'tforgetsomeoneyouloved", result);
    }
}