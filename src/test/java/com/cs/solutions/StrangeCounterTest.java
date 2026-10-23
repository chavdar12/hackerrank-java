package com.cs.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrangeCounterTest {

    @Test
    void solvesSamples() {
        assertEquals(3, StrangeCounter.strangeCounter(1));
        assertEquals(1, StrangeCounter.strangeCounter(3));
        assertEquals(6, StrangeCounter.strangeCounter(4));
        assertEquals(12, StrangeCounter.strangeCounter(10));
    }
}
