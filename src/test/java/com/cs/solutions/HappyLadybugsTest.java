package com.cs.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyLadybugsTest {

    @Test
    void solvesSamples() {
        assertEquals("YES", HappyLadybugs.happyLadybugs("RBY_YBR"));
        assertEquals("NO", HappyLadybugs.happyLadybugs("X_Y__X"));
        assertEquals("YES", HappyLadybugs.happyLadybugs("__"));
        assertEquals("YES", HappyLadybugs.happyLadybugs("B_RRBR"));
        assertEquals("NO", HappyLadybugs.happyLadybugs("AABCBC"));
    }
}
