package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TheHurdleRaceTest {

    @Test
    void solvesSamples() {
        assertEquals(2, TheHurdleRace.hurdleRace(4, List.of(1, 6, 3, 5, 2)));
        assertEquals(0, TheHurdleRace.hurdleRace(7, List.of(2, 5, 4, 5, 2)));
    }
}
