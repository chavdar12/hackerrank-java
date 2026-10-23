package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CircularArrayRotationTest {

    @Test
    void solvesSamples() {
        assertEquals(List.of(2, 3, 1), CircularArrayRotation.circularArrayRotation(List.of(1, 2, 3), 2, List.of(0, 1, 2)));
    }
}
