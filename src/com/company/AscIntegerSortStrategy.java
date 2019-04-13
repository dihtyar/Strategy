package com.company;

import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class AscIntegerSortStrategy implements SortStrategy<Integer> {

    @Override
    public Collection<Integer> sort(Collection<Integer> data) {
        return data
                .stream()
                .sorted((o1, o2) -> o2-o1)
                .collect(Collectors.toList());
    }
}
