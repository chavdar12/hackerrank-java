package com.cs.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppendAndDeleteTest {

    @Test
    void solvesSamples() {
        assertEquals("Yes", AppendAndDelete.appendAndDelete("hackerhappy", "hackerrank", 9));
        assertEquals("Yes", AppendAndDelete.appendAndDelete("aba", "aba", 7));
        assertEquals("No", AppendAndDelete.appendAndDelete("ashley", "ash", 2));
    }
}
