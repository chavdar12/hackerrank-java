package com.cs.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaircaseTest {

    @Test
    void solvesSamples() {
        assertEquals("   #\n  ##\n ###\n####", Staircase.staircase(4));
    }
}
