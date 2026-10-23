package com.cs.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HalloweenSaleTest {

    @Test
    void solvesSamples() {
        assertEquals(6, HalloweenSale.howManyGames(20, 3, 6, 80));
        assertEquals(7, HalloweenSale.howManyGames(20, 3, 6, 85));
    }
}
