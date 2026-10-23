package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BirthdayCakeCandlesTest {

    @Test
    void solvesSamples() {
        assertEquals(2, BirthdayCakeCandles.birthdayCakeCandles(List.of(3, 2, 1, 3)));
    }
}
