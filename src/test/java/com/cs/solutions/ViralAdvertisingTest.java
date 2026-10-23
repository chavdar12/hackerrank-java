package com.cs.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ViralAdvertisingTest {

    @Test
    void solvesSamples() {
        assertEquals(9, ViralAdvertising.viralAdvertising(3));
        assertEquals(24, ViralAdvertising.viralAdvertising(5));
    }
}
