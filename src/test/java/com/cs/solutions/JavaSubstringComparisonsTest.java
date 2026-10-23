package com.cs.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaSubstringComparisonsTest {

    @Test
    void solvesSamples() {
        assertEquals("ava\nwel", JavaSubstringComparisons.getSmallestAndLargest("welcometojava", 3));
        assertEquals("abc\nabc", JavaSubstringComparisons.getSmallestAndLargest("abc", 3));
    }
}
