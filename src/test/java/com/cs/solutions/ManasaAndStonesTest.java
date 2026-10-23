package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ManasaAndStonesTest {

    @Test
    void solvesSamples() {
        assertEquals(List.of(2, 3, 4), ManasaAndStones.stones(3, 1, 2));
        assertEquals(List.of(30, 120, 210, 300), ManasaAndStones.stones(4, 10, 100));
    }
}
