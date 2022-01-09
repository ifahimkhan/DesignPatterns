package com.fahim.mediator.observerimpl;

import com.fahim.mediator.DialogBox;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    protected void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
