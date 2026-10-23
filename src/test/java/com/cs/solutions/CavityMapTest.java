package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CavityMapTest {

    @Test
    void solvesSamples() {
        assertEquals(List.of("1112", "1X12", "18X2", "1234"), CavityMap.cavityMap(List.of("1112", "1912", "1892", "1234")));
    }
}
