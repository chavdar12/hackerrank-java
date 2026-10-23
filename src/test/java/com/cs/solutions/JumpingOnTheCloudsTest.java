package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JumpingOnTheCloudsTest {

    @Test
    void solvesSamples() {
        assertEquals(4, JumpingOnTheClouds.jumpingOnClouds(List.of(0, 0, 1, 0, 0, 1, 0)));
        assertEquals(3, JumpingOnTheClouds.jumpingOnClouds(List.of(0, 0, 0, 0, 1, 0)));
    }
}
