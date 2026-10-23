package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EqualizeTheArrayTest {

    @Test
    void solvesSamples() {
        assertEquals(2, EqualizeTheArray.equalizeArray(List.of(3, 3, 2, 1, 3)));
    }
}
