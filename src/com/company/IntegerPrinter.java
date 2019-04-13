package com.company;

import java.util.Collection;

public class IntegerPrinter implements Printer<Integer> {

    final SortStrategy<Integer> sortStrategy;

    public IntegerPrinter(SortStrategy<Integer> sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    @Override
    public void print(Collection<Integer> data) {
        System.out.println(sortStrategy.sort(data));
    }
}
