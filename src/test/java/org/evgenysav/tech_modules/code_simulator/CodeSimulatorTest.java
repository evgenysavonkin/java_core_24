package org.evgenysav.tech_modules.code_simulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeSimulatorTest {

    @Test
    void factorial() {
        int result = CodeSimulator.factorial(3);
        assertEquals(6, result);
    }

    @Test
    void is_prime() {
        boolean result = CodeSimulator.isPrime(5);
        assertTrue(result);
    }

    @Test
    void linear_search() {
        int[] arr = new int[]{1, 2, 13, 4, 5, 6, 7, 8, 9, 10};
        int result = CodeSimulator.linearSearch(arr, 13);
        assertEquals(2, result);
    }

    @Test
    void bubble_sort() {
        int[] unsortedArr = new int[]{6, 5, 4, 15, 2, 1};
        int[] expectedResult = new int[]{1, 2, 4, 5, 6, 15};
        int[] actualResult = CodeSimulator.bubbleSort(unsortedArr);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void fibonacci() {
        double result = CodeSimulator.fibonacci(6);
        assertEquals(8, result);
    }

    @Test
    void swap() {
        int[] swappedValues = CodeSimulator.swap(5, 10);
        assertArrayEquals(new int[]{10, 5}, swappedValues);
    }

    @Test
    void printMatrix(){
        CodeSimulator.printMatrix();
    }

    @Test
    void uniqueCharacters(){
        boolean result = CodeSimulator.uniqueCharacters("helo !");
        assertTrue(result);
    }

    @Test
    void equals(){
        boolean result = CodeSimulator.equals("Hello", "hello");
        assertFalse(result);
    }
}