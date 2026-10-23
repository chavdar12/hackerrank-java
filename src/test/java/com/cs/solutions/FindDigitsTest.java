package com.cs.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindDigitsTest {

    @Test
    void solvesSamples() {
        assertEquals(2, FindDigits.findDigits(12));
        assertEquals(3, FindDigits.findDigits(1012));
    }
}
