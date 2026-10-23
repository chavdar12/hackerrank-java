package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MiniMaxSumTest {

    @Test
    void solvesSamples() {
        assertEquals("10 14", MiniMaxSum.miniMaxSum(List.of(1, 2, 3, 4, 5)));
    }
}
