package com.cs.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpingOnTheCloudsRevisitedTest {

    @Test
    void solvesSamples() {
        assertEquals(92, JumpingOnTheCloudsRevisited.jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2));
    }
}
