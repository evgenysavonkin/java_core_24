package org.evgenysav.module3.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TaskFTest {

    @Test
    void get_replaced_empty_strings_array_case_1() {
        String[] result = TaskF.getReplacedEmptyStringsArray(5, new String[]{"Monday", "Tuesday", "",
                "Thursday", "Friday"});
        String[] expectedResult = new String[]{"Monday", "Tuesday", "String is empty",
                "Thursday", "Friday"};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    void get_replaced_empty_strings_array_case_2() {
        String[] result = TaskF.getReplacedEmptyStringsArray(4, new String[]{"Spring", "", "",
                "Winter"});
        String[] expectedResult = new String[]{"Spring", "String is empty", "String is empty",
                "Winter"};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    void get_replaced_empty_strings_array_case_3() {
        String[] result = TaskF.getReplacedEmptyStringsArray(6, new String[]{"", "White", "Black",
                "", "Yellow", "Red"});
        String[] expectedResult = new String[]{"String is empty", "White", "Black",
                "String is empty", "Yellow", "Red"};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    void get_replaced_empty_strings_array_case_4() {
        String[] result = TaskF.getReplacedEmptyStringsArray(3, new String[]{"eight o'clock", "nine o'clock",
                "ten o'clock"});
        String[] expectedResult = new String[]{"eight o'clock", "nine o'clock",
                "ten o'clock"};
        assertArrayEquals(expectedResult, result);
    }

}