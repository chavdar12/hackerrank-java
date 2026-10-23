package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingTheLeaderboardTest {

    @Test
    void solvesSamples() {
        assertEquals(List.of(6, 4, 2, 1), ClimbingTheLeaderboard.climbingLeaderboard(
                List.of(100, 100, 50, 40, 40, 20, 10), List.of(5, 25, 50, 120)));
    }
}
