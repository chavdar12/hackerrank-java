package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AcmIcpcTeamTest {

    @Test
    void solvesSamples() {
        assertEquals(List.of(5, 2), AcmIcpcTeam.acmTeam(List.of("10101", "11100", "11010", "00101")));
    }
}
