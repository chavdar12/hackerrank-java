package com.cs.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SherlockAndSquaresTest {

    @Test
    void solvesSamples() {
        assertEquals(2, SherlockAndSquares.squares(3, 9));
        assertEquals(0, SherlockAndSquares.squares(17, 24));
    }
}
