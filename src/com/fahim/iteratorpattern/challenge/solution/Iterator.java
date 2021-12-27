package com.fahim.iteratorpattern.challenge.solution;

public interface Iterator <T>{
    boolean hasNext();
    T getCurrent();
    void next();
}
