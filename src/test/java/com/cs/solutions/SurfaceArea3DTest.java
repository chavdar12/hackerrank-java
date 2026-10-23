package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SurfaceArea3DTest {

    @Test
    void solvesSamples() {
        assertEquals(6, SurfaceArea3D.surfaceArea(List.of(List.of(1))));
        assertEquals(60, SurfaceArea3D.surfaceArea(List.of(List.of(1, 3, 4), List.of(2, 2, 3), List.of(1, 2, 4))));
    }
}
