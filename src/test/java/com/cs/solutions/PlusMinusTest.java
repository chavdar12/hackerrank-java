package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlusMinusTest {

    @Test
    void solvesSamples() {
        assertEquals("0.500000\n0.333333\n0.166667", PlusMinus.plusMinus(List.of(-4, 3, -9, 0, 4, 1)));
    }
}
