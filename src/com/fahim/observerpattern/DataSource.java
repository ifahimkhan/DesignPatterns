package com.fahim.observerpattern;

public class DataSource extends Observable{
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObserver();
    }
}
