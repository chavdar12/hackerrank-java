package com.cs.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedKaprekarNumbersTest {

    @Test
    void solvesSamples() {
        assertEquals("1 9 45 55 99", ModifiedKaprekarNumbers.kaprekarNumbers(1, 100));
        assertEquals("INVALID RANGE", ModifiedKaprekarNumbers.kaprekarNumbers(2, 3));
    }
}
