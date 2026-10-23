package com.cs.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiggerIsGreaterTest {

    @Test
    void solvesSamples() {
        assertEquals("ba", BiggerIsGreater.biggerIsGreater("ab"));
        assertEquals("no answer", BiggerIsGreater.biggerIsGreater("bb"));
        assertEquals("hegf", BiggerIsGreater.biggerIsGreater("hefg"));
        assertEquals("dhkc", BiggerIsGreater.biggerIsGreater("dhck"));
        assertEquals("hcdk", BiggerIsGreater.biggerIsGreater("dkhc"));
    }
}
