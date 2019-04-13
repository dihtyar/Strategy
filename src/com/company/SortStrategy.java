package com.company;

import java.util.Collection;

public interface SortStrategy<T> {

    Collection<T> sort(Collection<T> data);
}
