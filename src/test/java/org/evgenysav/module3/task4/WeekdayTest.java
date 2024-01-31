package org.evgenysav.module3.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekdayTest {

    @Test
    void get_day_info_by_number_case_1() {
        String result = Weekday.getDayInfoByNumber(1);
        assertEquals("MONDAY (MON) is not a weekend.", result);
    }

    @Test
    void get_day_info_by_number_case_2() {
        String result = Weekday.getDayInfoByNumber(7);
        assertEquals("SUNDAY (SUN) is a weekend.", result);
    }

    @Test
    void get_day_info_by_number_case_3() {
        String result = Weekday.getDayInfoByNumber(3);
        assertEquals("WEDNESDAY (WED) is not a weekend.", result);
    }

    @Test
    void get_day_info_by_number_case_4() {
        String result = Weekday.getDayInfoByNumber(0);
        assertEquals("0", result);
    }

    @Test
    void get_day_info_by_number_case_5() {
        String result = Weekday.getDayInfoByNumber(8);
        assertEquals("8", result);
    }
}