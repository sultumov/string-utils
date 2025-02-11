package com.example.sortsearch;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SortSearchUtilsTest {

    private final SortSearchUtils sortSearchUtils = new SortSearchUtils();

    @Test
    void bubbleSort_validArray_sortsArrayCorrectly() {
        int[] array = {5, 1, 4, 2, 8};
        sortSearchUtils.bubbleSort(array);
        assertArrayEquals(new int[]{1, 2, 4, 5, 8}, array);
    }

    @Test
    void bubbleSort_emptyArray_doesNothing() {
        int[] array = {};
        sortSearchUtils.bubbleSort(array);
        assertArrayEquals(new int[]{}, array);
    }

    @Test
    void bubbleSort_nullArray_doesNothing() {
        int[] array = null;
        sortSearchUtils.bubbleSort(array);
        assertNull(array); // This test fails.  bubbleSort should handle null.
    }

    @Test
    void bubbleSort_alreadySortedArray_doesNothing() {
        int[] array = {1, 2, 3, 4, 5};
        sortSearchUtils.bubbleSort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    void linearSearch_validArrayAndKey_returnsCorrectIndex() {
        int[] array = {5, 1, 4, 2, 8};
        assertEquals(1, sortSearchUtils.linearSearch(array, 1));
        assertEquals(3, sortSearchUtils.linearSearch(array, 2));
    }

    @Test
    void linearSearch_keyNotFound_returnsMinusOne() {
        int[] array = {5, 1, 4, 2, 8};
        assertEquals(-1, sortSearchUtils.linearSearch(array, 3));
    }

    @Test
    void linearSearch_nullArray_returnsMinusOne() {
        int[] array = null;
        assertEquals(-1, sortSearchUtils.linearSearch(array, 3));
    }
}
