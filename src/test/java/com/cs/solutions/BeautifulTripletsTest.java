package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BeautifulTripletsTest {

    @Test
    void solvesSamples() {
        assertEquals(3, BeautifulTriplets.beautifulTriplets(3, List.of(1, 2, 4, 5, 7, 8, 10)));
    }
}
