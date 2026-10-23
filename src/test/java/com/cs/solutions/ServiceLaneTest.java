package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ServiceLaneTest {

    @Test
    void solvesSamples() {
        assertEquals(List.of(1, 2, 3, 2, 1), ServiceLane.serviceLane(List.of(2, 3, 1, 2, 3, 2, 3, 3),
                List.of(List.of(0, 3), List.of(4, 6), List.of(6, 7), List.of(3, 5), List.of(0, 7))));
    }
}
