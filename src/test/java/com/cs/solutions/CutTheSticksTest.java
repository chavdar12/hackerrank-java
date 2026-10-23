package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CutTheSticksTest {

    @Test
    void solvesSamples() {
        assertEquals(List.of(6, 4, 2, 1), CutTheSticks.cutTheSticks(List.of(5, 4, 4, 2, 2, 8)));
    }
}
