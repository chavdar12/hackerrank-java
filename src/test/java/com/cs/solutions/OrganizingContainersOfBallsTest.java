package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrganizingContainersOfBallsTest {

    @Test
    void solvesSamples() {
        assertEquals("Possible", OrganizingContainersOfBalls.organizingContainers(List.of(List.of(1, 1), List.of(1, 1))));
        assertEquals("Impossible", OrganizingContainersOfBalls.organizingContainers(List.of(List.of(0, 2), List.of(1, 1))));
    }
}
