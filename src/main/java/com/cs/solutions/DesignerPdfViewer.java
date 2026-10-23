package com.cs.solutions;

import java.util.List;

public class DesignerPdfViewer {

    public static int designerPdfViewer(List<Integer> h, String word) {
        int maxHeight = 0;
        for (char c : word.toCharArray()) {
            maxHeight = Math.max(maxHeight, h.get(c - 'a'));
        }
        return maxHeight * word.length();
    }
}
