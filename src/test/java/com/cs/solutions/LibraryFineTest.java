package com.cs.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryFineTest {

    @Test
    void solvesSamples() {
        assertEquals(45, LibraryFine.libraryFine(9, 6, 2015, 6, 6, 2015));
        assertEquals(1000, LibraryFine.libraryFine(1, 8, 2015, 1, 6, 2015));
        assertEquals(10000, LibraryFine.libraryFine(1, 1, 2016, 31, 12, 2015));
        assertEquals(0, LibraryFine.libraryFine(1, 1, 2015, 2, 1, 2015));
    }
}
