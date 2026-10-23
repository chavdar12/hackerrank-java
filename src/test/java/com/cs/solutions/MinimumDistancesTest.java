package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDistancesTest {

    @Test
    void solvesSamples() {
        assertEquals(3, MinimumDistances.minimumDistances(List.of(7, 1, 3, 4, 1, 7)));
        assertEquals(-1, MinimumDistances.minimumDistances(List.of(1, 2, 3)));
    }
}
