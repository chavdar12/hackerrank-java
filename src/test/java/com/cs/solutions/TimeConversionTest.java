package com.cs.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeConversionTest {

    @Test
    void solvesSamples() {
        assertEquals("19:05:45", TimeConversion.timeConversion("07:05:45PM"));
        assertEquals("00:01:00", TimeConversion.timeConversion("12:01:00AM"));
        assertEquals("12:00:00", TimeConversion.timeConversion("12:00:00PM"));
    }
}
