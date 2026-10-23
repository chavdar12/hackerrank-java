package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SequenceEquationTest {

    @Test
    void solvesSamples() {
        assertEquals(List.of(2, 3, 1), SequenceEquation.permutationEquation(List.of(2, 3, 1)));
        assertEquals(List.of(1, 3, 5, 4, 2), SequenceEquation.permutationEquation(List.of(4, 3, 5, 1, 2)));
    }
}
