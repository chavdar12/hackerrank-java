package com.cs.solutions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QueensAttackIITest {

    @Test
    void solvesSamples() {
        assertEquals(9, QueensAttackII.queensAttack(4, 4, 4, List.of()));
        assertEquals(10, QueensAttackII.queensAttack(5, 4, 3, List.of(List.of(5, 5), List.of(4, 2), List.of(2, 3))));
        assertEquals(0, QueensAttackII.queensAttack(1, 1, 1, List.of()));
        assertEquals(27, QueensAttackII.queensAttack(8, 4, 4, List.of()));
        assertEquals(26, QueensAttackII.queensAttack(8, 4, 4, List.of(List.of(4, 8), List.of(4, 9))));
    }
}
