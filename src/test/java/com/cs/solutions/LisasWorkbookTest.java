package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LisasWorkbookTest {

    @Test
    void solvesSamples() {
        assertEquals(4, LisasWorkbook.workbook(5, 3, List.of(4, 2, 6, 1, 10)));
    }
}
