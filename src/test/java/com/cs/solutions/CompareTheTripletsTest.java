package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CompareTheTripletsTest {

    @Test
    void solvesSamples() {
        assertEquals(List.of(1, 1), CompareTheTriplets.compareTriplets(List.of(5, 6, 7), List.of(3, 6, 10)));
    }
}
