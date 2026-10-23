package com.cs.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaveThePrisonerTest {

    @Test
    void solvesSamples() {
        assertEquals(2, SaveThePrisoner.saveThePrisoner(5, 2, 1));
        assertEquals(3, SaveThePrisoner.saveThePrisoner(5, 2, 2));
        assertEquals(6, SaveThePrisoner.saveThePrisoner(7, 19, 2));
        assertEquals(3, SaveThePrisoner.saveThePrisoner(3, 7, 3));
    }
}
