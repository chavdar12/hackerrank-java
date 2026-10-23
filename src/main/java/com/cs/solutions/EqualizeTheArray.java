package com.cs.solutions;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EqualizeTheArray {

    public static int equalizeArray(List<Integer> arr) {
        Map<Integer, Long> freq = arr.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return arr.size() - Collections.max(freq.values()).intValue();
    }
}
