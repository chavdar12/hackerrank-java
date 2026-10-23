package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DesignerPdfViewerTest {

    @Test
    void solvesSamples() {
        List<Integer> h = List.of(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
        assertEquals(9, DesignerPdfViewer.designerPdfViewer(h, "abc"));
    }
}
