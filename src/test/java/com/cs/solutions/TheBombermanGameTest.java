package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TheBombermanGameTest {

    @Test
    void solvesSamples() {
        List<String> grid = List.of(".......", "...O...", "....O..", ".......", "OO.....", "OO.....");
        assertEquals(List.of("OOO.OOO", "OO...OO", "OOO...O", "..OO.OO", "...OOOO", "...OOOO"), TheBombermanGame.bomberMan(3, grid));
        assertEquals(grid, TheBombermanGame.bomberMan(1, grid));
        assertEquals(List.of("OOOOOOO", "OOOOOOO", "OOOOOOO", "OOOOOOO", "OOOOOOO", "OOOOOOO"), TheBombermanGame.bomberMan(2, grid));
    }
}
