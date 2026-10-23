package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AbsolutePermutationTest {

    @Test
    void solvesSamples() {
        assertEquals(List.of(2, 1), AbsolutePermutation.absolutePermutation(2, 1));
        assertEquals(List.of(1, 2, 3), AbsolutePermutation.absolutePermutation(3, 0));
        assertEquals(List.of(-1), AbsolutePermutation.absolutePermutation(3, 2));
    }
}
