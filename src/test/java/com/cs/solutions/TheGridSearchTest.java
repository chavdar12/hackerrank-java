package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TheGridSearchTest {

    @Test
    void solvesSamples() {
        List<String> grid = List.of("7283455864", "6731158619", "8988242643", "3830589324", "2229505813",
                "5633845374", "6473530293", "7053106601", "0834282956", "4607924137");
        assertEquals("YES", TheGridSearch.gridSearch(grid, List.of("9505", "3845", "3530")));
        assertEquals("NO", TheGridSearch.gridSearch(List.of("1234", "5678"), List.of("99")));
    }
}
