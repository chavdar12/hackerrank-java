package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NonDivisibleSubsetTest {

    @Test
    void solvesSamples() {
        assertEquals(3, NonDivisibleSubset.nonDivisibleSubset(3, List.of(1, 7, 2, 4)));
        assertEquals(3, NonDivisibleSubset.nonDivisibleSubset(4, List.of(19, 10, 12, 10, 24, 25, 22)));
    }
}
