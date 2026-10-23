package com.cs.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtopianTreeTest {

    @Test
    void solvesSamples() {
        assertEquals(1, UtopianTree.utopianTree(0));
        assertEquals(2, UtopianTree.utopianTree(1));
        assertEquals(7, UtopianTree.utopianTree(4));
    }
}
