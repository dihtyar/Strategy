package com.company;

import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescSortStrategy implements SortStrategy<Integer> {

    @Override
    public Collection<Integer> sort(Collection<Integer> data) {
        return data
                .stream()
                .sorted(Comparator.comparingInt(o -> o))
                .collect(Collectors.toList());
    }
}
