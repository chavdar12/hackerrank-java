package com.cs.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaumAndBdayTest {

    @Test
    void solvesSamples() {
        assertEquals(20, TaumAndBday.taumBday(10, 10, 1, 1, 1));
        assertEquals(37, TaumAndBday.taumBday(5, 9, 2, 3, 4));
        assertEquals(12, TaumAndBday.taumBday(3, 6, 9, 1, 1));
        assertEquals(35, TaumAndBday.taumBday(7, 7, 4, 2, 1));
        assertEquals(12, TaumAndBday.taumBday(3, 3, 1, 9, 2));
    }
}
