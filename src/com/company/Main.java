package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Collection<Integer> data = Arrays.asList(3, 5, 1, 0, 9, 6, 4, 5, 10);

        Printer<Integer> printerAsc = new IntegerPrinter(new AscIntegerSortStrategy());
        Printer<Integer> printerDesc = new IntegerPrinter(new DescSortStrategy());
        printerAsc.print(data);
        printerDesc.print(data);

        Printer<Integer> printerA =
                new IntegerPrinter(
                        data1 -> data1
                                .stream()
                                .filter(integer -> integer > 5)
                                .collect(Collectors.toList())
                );
        printerA.print(data);

    }
}
