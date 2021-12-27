package com.fahim.iteratorpattern;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
