package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SimpleArraySumTest {

    @Test
    void solvesSamples() {
        assertEquals(31, SimpleArraySum.simpleArraySum(List.of(1, 2, 3, 4, 10, 11)));
    }
}
