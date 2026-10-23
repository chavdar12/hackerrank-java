package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AVeryBigSumTest {

    @Test
    void solvesSamples() {
        assertEquals(5000000015L, AVeryBigSum.aVeryBigSum(List.of(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L)));
    }
}
