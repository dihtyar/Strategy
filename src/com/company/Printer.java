package com.company;

import java.util.Collection;

public interface Printer<T> {

    void print(Collection<T> data);
}
