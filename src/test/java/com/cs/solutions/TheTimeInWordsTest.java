package com.cs.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheTimeInWordsTest {

    @Test
    void solvesSamples() {
        assertEquals("five o' clock", TheTimeInWords.timeInWords(5, 0));
        assertEquals("one minute past five", TheTimeInWords.timeInWords(5, 1));
        assertEquals("ten minutes past five", TheTimeInWords.timeInWords(5, 10));
        assertEquals("quarter past five", TheTimeInWords.timeInWords(5, 15));
        assertEquals("half past five", TheTimeInWords.timeInWords(5, 30));
        assertEquals("twenty minutes to six", TheTimeInWords.timeInWords(5, 40));
        assertEquals("quarter to six", TheTimeInWords.timeInWords(5, 45));
        assertEquals("thirteen minutes to six", TheTimeInWords.timeInWords(5, 47));
        assertEquals("quarter to one", TheTimeInWords.timeInWords(12, 45));
    }
}
